package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.entity.AbstractEntity;
import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.common.support.EntityHandler;
import com.eyevision.framework.common.util.StringUtil;
import com.eyevision.framework.common.vo.VOUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.framework.spring.mybatis.IdGenerateUtil;
import com.eyevision.kf.common.enums.DeliveryType;
import com.eyevision.kf.common.enums.GoodsStatus;
import com.eyevision.kf.common.enums.GoodsType;
import com.eyevision.kf.common.enums.GoodsUpdateModule;
import com.eyevision.kf.service.entity.*;
import com.eyevision.kf.service.mapper.GoodsDeliveryHospitalMapper;
import com.eyevision.kf.service.mapper.GoodsNormMapper;
import com.eyevision.kf.service.mapper.GoodsPictureMapper;
import com.eyevision.kf.service.mapper.RelevantGoodsMapper;
import com.eyevision.kf.service.service.site.StGoodsService;
import com.eyevision.kf.service.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;
import java.util.ArrayList;
import java.util.List;

@Service
public class StGoodsServiceImpl extends AbstractMapperService<Goods, GoodsVO> implements StGoodsService {
    @Autowired
    private GoodsPictureMapper goodsPictureMapper;
    @Autowired
    private GoodsDeliveryHospitalMapper goodsDeliveryHospitalMapper;
    @Autowired
    private GoodsNormMapper goodsNormMapper;
    @Autowired
    private RelevantGoodsMapper relevantGoodsMapper;

    @Override
    public GoodsVO findDetail(Long id, boolean byBusiness) {
        GoodsVO vo = super.find(id);
        vo.setPictures(listPicture(id));
        if (byBusiness) {
            vo.setNorms(listNorm(id, GoodsStatus.ON_OFFER));
        } else {
            vo.setNorms(listNorm(id, null));
            vo.setHospitals(listDepartment(id));
            vo.setRelevantGoodsList(listRelevantGoods(id));
        }
        return vo;
    }

    @Override
    public GoodsVO save(GoodsVO vo) {
        GoodsVO res = new GoodsVO();
        Long id = vo.getId();
        boolean isCreated = id == null;
        String loginUser = getUser();
        if (isCreated) {
            validate(vo);
            if (vo.getSales() == null) {
                vo.setSales(0);
            }
            super.add(vo);
        } else {
            Goods entity = mapper.selectByPrimaryKey(vo.getId());
            if (entity == null) {
                throw new ValidateException(NOT_EXSIT_ERROR);
            }
            if (vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_GOODS.value)) {
                validate(vo);
                VOUtil.initEntity(vo, entity);
                mapper.updateByPrimaryKey(entity);
            } else {
                vo.setType(entity.getType());
                vo.setStatus(vo.getStatus());
            }
        }
        res.setId(vo.getId());
        if ((isCreated || (vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_GOODS.value)))
                && vo.getDeliveryType().equals(DeliveryType.NEARBY_HOSPITAL)) {
            validate(vo, "hospitals");
            vo.getHospitals().forEach(temp -> {
                if (temp.getId() != null) {
                    validate(temp);
                    GoodsDeliveryHospital gdh = VOUtil.toEntity(temp, GoodsDeliveryHospital.class);
                    gdh.setGoodsId(vo.getId());
                    EntityHandler.init(gdh, loginUser, true);
                    goodsDeliveryHospitalMapper.insert(gdh);
                }
            });
        }
        if (isCreated || vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_NORM.value)) {
            validate(vo, "norms");
            vo.getNorms().forEach(temp -> {
                String[] validateFields;
                if (vo.getType().equals(GoodsType.NORMAL.value)) {
                    validateFields = new String[] {
                            "title", "marketPrice", "price", "groupBuyingPrice", "number", "status"
                    };
                } else {
                    validateFields = new String[] {
                                "title", "marketPrice", "price", "deposit", "rentDay", "overdueDayFee", "number", "status"};
                }
                validate(temp, validateFields);
                if (temp.getId() == null) {
                    GoodsNorm norm = VOUtil.toEntity(temp, GoodsNorm.class);
                    EntityHandler.init(norm, loginUser, true);
                    norm.setGoodsId(vo.getId());
                    goodsNormMapper.insert(norm);
                } else {
                    GoodsNorm norm = goodsNormMapper.selectByPrimaryKey(temp.getId());
                    VOUtil.initEntity(temp, norm);
                    EntityHandler.init(norm, loginUser, false);
                    goodsNormMapper.updateByPrimaryKey(norm);
                }
            });
        }
        if ((isCreated || vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_RELEVANT_GOODS)) &&
                (vo.getRelevantGoodsList() !=null && !vo.getRelevantGoodsList().isEmpty())) {
            vo.getRelevantGoodsList().forEach(temp -> {
                validate(temp);
                RelevantGoods relevantGoods = VOUtil.toEntity(temp, RelevantGoods.class);
                EntityHandler.init(relevantGoods, loginUser, false);
                relevantGoods.setGoodsId(vo.getId());
                relevantGoodsMapper.insert(relevantGoods);
            });
        }
        if (!isCreated) {
            if (StringUtil.isNotNull(vo.getDelModuleIdStr())) {
                if (vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_NORM.value)
                        && !vo.getStatus().equals(GoodsStatus.OUT_OF_STOCK.value)) {
                    throw new ValidateException("只能删除下架商品的规格");
                }
                deleteModules(vo.getDelModuleIdStr(), vo.getUpdateModule());
            }
            if (vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_NORM.value)) {
                res.setNorms(listNorm(vo.getId(), null));
            } else if (vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_GOODS.value)) {
                if (vo.getDeliveryType().equals(DeliveryType.NEARBY_HOSPITAL.value)) {
                    res.setHospitals(listDepartment(vo.getId()));
                }
            } else if (vo.getUpdateModule().equals(GoodsUpdateModule.SAVE_RELEVANT_GOODS.value)) {
                res.setRelevantGoodsList(listRelevantGoods(vo.getId()));
            } else {
                throw new ValidateException("传参错误");
            }
        }
        return res;
    }

    @Override
    public List<GoodsPictureVO> savePictures(Long id, String urls, String delPicIdStr) {
        if (urls != null) {
            String loginUser = getUser();
            List<GoodsPicture> list = new ArrayList<>();
            for (String url : urls.split(",")) {
                GoodsPicture entity = new GoodsPicture();
                entity.setGoodsId(id);
                entity.setUrl(url);
                EntityHandler.init(entity, loginUser, true);
                entity.setId((Long) IdGenerateUtil.generate());
                list.add(entity);
            }
            goodsPictureMapper.insertList(list);
        }
        if (StringUtil.isNotNull(delPicIdStr)) {
            deleteModules(delPicIdStr, GoodsUpdateModule.SAVE_PICTURE.value);
        }
        return listPicture(id);
    }

    @Override
    public List<GoodsNormVO> listNorm(Long id, GoodsStatus status) {
        GoodsNorm condition = new GoodsNorm();
        condition.setGoodsId(id);
        if (status != null) {
            condition.setStatus(status.value);
        }
        List<GoodsNorm> norms = goodsNormMapper.select(condition);
        return VOUtil.toVO(norms, GoodsNormVO.class);
    }

    @Override
    protected Example formToExample(Object o) {
        return null;
    }

    private List<GoodsPictureVO> listPicture(Long id) {
        GoodsPicture condition = new GoodsPicture();
        condition.setGoodsId(id);
        List<GoodsPicture> pictures = goodsPictureMapper.select(condition);
        return VOUtil.toVO(pictures, GoodsPictureVO.class);
    }

    private void deleteModules(String delModuleIdStr, Integer updateModule) {
        List<Long> delModuleIds = StringUtil.toLongList(delModuleIdStr);
        Class<? extends AbstractEntity> moduleClass;
        Mapper<? extends AbstractEntity> moduleMapper;
        if (updateModule.equals(GoodsUpdateModule.SAVE_NORM.value)) {
            moduleClass = GoodsNorm.class;
            moduleMapper = goodsNormMapper;
        } else if (updateModule.equals(GoodsUpdateModule.SAVE_GOODS.value)) {
            moduleClass = GoodsDeliveryHospital.class;
            moduleMapper = goodsDeliveryHospitalMapper;
        } else if (updateModule.equals(GoodsUpdateModule.SAVE_RELEVANT_GOODS.value)) {
            moduleClass = RelevantGoods.class;
            moduleMapper = relevantGoodsMapper;
        } else if (updateModule.equals(GoodsUpdateModule.SAVE_PICTURE.value)) {
            moduleClass = GoodsPicture.class;
            moduleMapper = goodsPictureMapper;
        } else {
            throw new ValidateException("传参错误");
        }
        Example example = new Example(moduleClass);
        example.createCriteria().andIn("id", delModuleIds);
        moduleMapper.deleteByExample(example);
    }

    private List<GoodsDeliveryHospitalVO> listDepartment(Long id) {
        GoodsDeliveryHospital condition = new GoodsDeliveryHospital();
        condition.setGoodsId(id);
        List<GoodsDeliveryHospital> list = goodsDeliveryHospitalMapper.select(condition);
        return VOUtil.toVO(list, GoodsDeliveryHospitalVO.class);
    }

    private List<RelevantGoodsVO> listRelevantGoods(Long id) {
        RelevantGoods condition = new RelevantGoods();
        condition.setGoodsId(id);
        List<RelevantGoods> pictures = relevantGoodsMapper.select(condition);
        return VOUtil.toVO(pictures, RelevantGoodsVO.class);
    }
}
