package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.vo.VOUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.kf.service.entity.GoodsPicture;
import com.eyevision.kf.service.service.site.StGoodsPictureService;
import com.eyevision.kf.service.vo.GoodsPictureVO;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class StGoodsPictureServiceImpl extends AbstractMapperService<GoodsPicture, GoodsPictureVO> implements StGoodsPictureService {

    @Override
    public List<GoodsPictureVO> listByGoodsId(Long goodsId) {
        Example example = new Example(entityClass);
        example.createCriteria()
                .andEqualTo("goodsId",goodsId);
        List<GoodsPicture> list = mapper.selectByExample(example);
        return VOUtil.toVO(list, GoodsPictureVO.class);
    }

    @Override
    public Map<Long, List<GoodsPictureVO>> mapByKeyGoods(Collection<Long> goodsIds) {
        Example example = new Example(entityClass);
        example.createCriteria()
                .andIn("goodsId",goodsIds);
        List<GoodsPicture> list = mapper.selectByExample(example);
        return list.stream().collect(Collectors.groupingBy(
                GoodsPicture::getGoodsId,
                Collectors.mapping(picture -> VOUtil.toVO(picture, GoodsPictureVO.class), Collectors.toList())
        ));
    }

    @Override
    protected Example formToExample(Object o) {
        return null;
    }
}
