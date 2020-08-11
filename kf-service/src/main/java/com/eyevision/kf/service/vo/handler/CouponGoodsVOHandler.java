/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.vo.handler;


import com.eyevision.framework.common.vo.handler.VOHandler;
import com.eyevision.kf.service.entity.CouponGoods;
import com.eyevision.kf.service.vo.CouponGoodsVO;


/**
 * Description
 *
 * @author system
 * @since 2019-05-31 21:34
 */
public class CouponGoodsVOHandler extends VOHandler<CouponGoods, CouponGoodsVO> {
    @Override
    public void entity2VO(CouponGoods entity, CouponGoodsVO vo, String... fieldNames) {
        super.entity2VO(entity, vo, fieldNames);
    }

    @Override
    public void vo2Entity(CouponGoodsVO vo, CouponGoods entity, String... fieldNames) {
        super.vo2Entity(vo, entity, fieldNames);
    }
}
