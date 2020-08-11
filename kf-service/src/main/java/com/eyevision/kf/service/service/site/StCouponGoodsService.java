package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.service.BaseService;
import com.eyevision.kf.service.vo.CouponGoodsVO;


public interface StCouponGoodsService extends BaseService<CouponGoodsVO> {
    void save(Long goodsId, Long couponId);
}
