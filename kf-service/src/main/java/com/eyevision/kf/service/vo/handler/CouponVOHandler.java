/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.vo.handler;


import com.eyevision.framework.common.vo.handler.VOHandler;
import com.eyevision.kf.service.entity.Coupon;
import com.eyevision.kf.service.vo.CouponVO;


/**
 * Description
 *
 * @author system
 * @since 2019-05-31 21:34
 */
public class CouponVOHandler extends VOHandler<Coupon, CouponVO> {
    @Override
    public void entity2VO(Coupon entity, CouponVO vo, String... fieldNames) {
        super.entity2VO(entity, vo, fieldNames);
    }

    @Override
    public void vo2Entity(CouponVO vo, Coupon entity, String... fieldNames) {
        super.vo2Entity(vo, entity, fieldNames);
    }
}
