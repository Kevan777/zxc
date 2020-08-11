package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.common.model.Page;
import com.eyevision.framework.common.model.PageForm;
import com.eyevision.framework.common.support.EntityHandler;
import com.eyevision.framework.common.util.DateUtil;
import com.eyevision.framework.common.util.StringUtil;
import com.eyevision.framework.common.vo.VOUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.framework.spring.mybatis.IdGenerateUtil;
import com.eyevision.kf.common.enums.SeckillingActivityStatus;
import com.eyevision.kf.service.entity.*;
import com.eyevision.kf.service.form.SeckillingActivityForm;
import com.eyevision.kf.service.mapper.*;
import com.eyevision.kf.service.service.site.StSeckillingActivityService;
import com.eyevision.kf.service.vo.GoodsNormVO;
import com.eyevision.kf.service.vo.SeckillingActivityGoodsNormVO;
import com.eyevision.kf.service.vo.SeckillingActivityGoodsVO;
import com.eyevision.kf.service.vo.SeckillingActivityVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StSeckillingActivityServiceImpl extends AbstractMapperService<SeckillingActivity, SeckillingActivityVO> implements StSeckillingActivityService {
    @Autowired
    private SeckillingActivityGoodsMapper seckillingActivityGoodsMapper;
    @Autowired
    private SeckillingActivityGoodsNormMapper seckillingActivityGoodsNormMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsNormMapper goodsNormMapper;

    @Override
    public Page<SeckillingActivityVO> paging(Object form, PageForm pf) {
        pf.setSort("start_time");
        pf.setOrder("desc");
        return super.paging(form, pf);
    }

    @Override
    protected Example formToExample(Object form) {
        SeckillingActivityForm myForm = (SeckillingActivityForm) form;
        Example example = new Example(entityClass);
        Example.Criteria criteria = example.createCriteria();
        Calendar cal = null;
        if (myForm.getStartDate() != null) {
            cal = Calendar.getInstance();
            cal.setTimeInMillis(myForm.getStartDate());
            DateUtil.cleanTime(cal);
            criteria.andGreaterThanOrEqualTo("startTime", cal.getTime());
        }
        if (myForm.getEndDate() != null) {
            if (cal == null) {
                cal = Calendar.getInstance();
                cal.setTimeInMillis(myForm.getEndDate());
                DateUtil.setLastSecond(cal);
                criteria.andLessThanOrEqualTo("endTime", cal.getTime());
            }
        }
        return example;
    }

    @Override
    public void save(SeckillingActivityVO vo) {
        validate(vo);
        if (!checkValidity(vo)) {
            throw new ValidateException("活动时间段有交叉");
        }
        String loginUser = getUser();
        boolean isCreated = vo.getId() == null;
        SeckillingActivity entity;
        if (isCreated) {
            entity = VOUtil.toEntity(vo, SeckillingActivity.class);
           EntityHandler.init(entity, loginUser);
           mapper.insert(entity);
           vo.setId(IdGenerateUtil.current());
        } else {
            entity = mapper.selectByPrimaryKey(vo.getId());
            if (entity != null) {
                throw new ValidateException(NOT_EXSIT_ERROR);
            }
            if (entity.getStatus().equals(SeckillingActivityStatus.ON_OFFER)) {
                throw new ValidateException("该秒杀活动已上线");
            }
            VOUtil.initEntity(vo, entity);
            EntityHandler.init(entity, loginUser);
            mapper.updateByPrimaryKey(entity);
            if (StringUtil.isNotNull(vo.getDelGoodsIdStr())) {
                List<Long> delGoodsIdList = StringUtil.toLongList(vo.getDelGoodsIdStr());
                Example example = new Example(SeckillingActivityGoods.class);
                example.createCriteria().andIn("id", delGoodsIdList);
                seckillingActivityGoodsMapper.deleteByExample(example);
                example = new Example(SeckillingActivityGoodsNorm.class);
                example.createCriteria().andIn("seckillingActivityGoodsId", delGoodsIdList);
                seckillingActivityGoodsNormMapper.deleteByExample(example);
            }
        }
        for (int i = 0; i < vo.getSeckillingGoodsList().size(); i++) {
            SeckillingActivityGoodsVO goodsVO = vo.getSeckillingGoodsList().get(i);
            validate(goodsVO);
            SeckillingActivityGoods goods = VOUtil.toEntity(goodsVO, SeckillingActivityGoods.class);
            EntityHandler.init(goods, loginUser);
            goods.setSortNum(i);
            if (goodsVO.getId() == null) {
                goods.setSeckillingActivityId(vo.getId());
                seckillingActivityGoodsMapper.insert(goods);
                goodsVO.setId(IdGenerateUtil.current());
            } else {
                seckillingActivityGoodsMapper.updateByPrimaryKeySelective(goods);
            }
            goodsVO.getNorms().forEach(normVO -> {
                validate(normVO);
                SeckillingActivityGoodsNorm norm = VOUtil.toEntity(normVO, SeckillingActivityGoodsNorm.class);
                EntityHandler.init(norm, loginUser);
                if (norm.getId() == null) {
                    norm.setSeckillingActivityGoodsId(goodsVO.getId());
                    seckillingActivityGoodsNormMapper.insert(norm);
                } else {
                    seckillingActivityGoodsNormMapper.updateByPrimaryKeySelective(norm);
                }
            });
        }
    }

    @Override
    public SeckillingActivityVO findDetail(Long id) {
        SeckillingActivityVO vo = super.find(id);
        Example example = new Example(SeckillingActivityGoods.class);
        example.setOrderByClause("sort_num asc");
        example.createCriteria().andEqualTo("seckillingActivityId", id);
        List<SeckillingActivityGoods> saGoodsList = seckillingActivityGoodsMapper.selectByExample(example);
        example = new Example(Goods.class);
        Set<Long> goodsIdSet = saGoodsList.stream().map(SeckillingActivityGoods::getGoodsId).collect(Collectors.toSet());
        example.createCriteria().andIn("id", goodsIdSet);
        example.selectProperties("id", "name");
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        Map<Long, String> goodsMap = goodsList.stream().collect(Collectors.toMap(Goods::getId, Goods::getName));
        List<SeckillingActivityGoodsNorm> norms = seckillingActivityGoodsNormMapper.selectByActivityAndGoods(id, null);
        example = new Example(GoodsNorm.class);
        example.createCriteria().andIn("goodsId", goodsIdSet);
        List<GoodsNorm> originalNorms = goodsNormMapper.selectByExample(example);
        Map<Long, GoodsNormVO> originalNormMap = originalNorms.stream().collect(Collectors.toMap(
                GoodsNorm::getId, temp -> VOUtil.toVO(temp, GoodsNormVO.class)
        ));
        Map<Long, List<SeckillingActivityGoodsNormVO>> normMap = norms.stream()
                .collect(Collectors.groupingBy(
                        SeckillingActivityGoodsNorm::getSeckillingActivityGoodsId,
                        Collectors.mapping(temp -> {
                            SeckillingActivityGoodsNormVO normVO = VOUtil.toVO(temp, SeckillingActivityGoodsNormVO.class);
                            normVO.setOriginalNorm(originalNormMap.get(normVO.getGoodsNormId()));
                            return normVO;
                        }, Collectors.toList())
                ));
        vo.setSeckillingGoodsList(saGoodsList.stream().map(saGoods -> {
            SeckillingActivityGoodsVO saGoodsVO = VOUtil.toVO(saGoods, SeckillingActivityGoodsVO.class);
            saGoodsVO.setGoodsName(goodsMap.get(saGoodsVO.getGoodsId()));
            saGoodsVO.setNorms(normMap.getOrDefault(saGoodsVO.getId(), Collections.emptyList()));
            return saGoodsVO;
        }).collect(Collectors.toList()));
        return vo;
    }

    @Override
    public void outOfStock(Long id) {
        SeckillingActivity entity = new SeckillingActivity();
        entity.setId(id);
        entity.setStatus(SeckillingActivityStatus.OUT_OF_STOCK.value);
        mapper.updateByPrimaryKeySelective(entity);
    }

    private boolean checkValidity(SeckillingActivityVO vo) {
        return ((SeckillingActivityMapper)mapper).selectCountByCheck(vo.getId(), new Date(vo.getStartTime()),
                new Date(vo.getEndTime()))==0;

    }
}
