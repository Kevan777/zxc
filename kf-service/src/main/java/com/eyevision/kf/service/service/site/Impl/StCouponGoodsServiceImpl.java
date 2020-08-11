package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.kf.service.entity.CouponGoods;
import com.eyevision.kf.service.service.site.StCouponGoodsService;
import com.eyevision.kf.service.vo.CouponGoodsVO;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
@Service
public class StCouponGoodsServiceImpl extends AbstractMapperService<CouponGoods, CouponGoodsVO> implements StCouponGoodsService {
    @Override
    public void save(Long goodsId, Long couponId){
        CouponGoods entity = new CouponGoods();
        entity.setCouponId(couponId);
        entity.setGoodsId(goodsId);
        //EntityHandler.init(entity, getUser(), true);
        validate(entity);
        mapper.insert(entity);
    }

    @Override
    protected Example formToExample(Object o) {
        return null;
    }
}
