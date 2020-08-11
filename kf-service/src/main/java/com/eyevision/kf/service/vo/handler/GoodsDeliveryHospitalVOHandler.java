/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.vo.handler;


import com.eyevision.framework.common.vo.handler.VOHandler;
import com.eyevision.kf.service.entity.GoodsDeliveryHospital;
import com.eyevision.kf.service.vo.GoodsDeliveryHospitalVO;


/**
 * Description
 *
 * @author system
 * @since 2018-11-26 21:55
 */
public class GoodsDeliveryHospitalVOHandler extends VOHandler<GoodsDeliveryHospital, GoodsDeliveryHospitalVO> {
    @Override
    public void entity2VO(GoodsDeliveryHospital entity, GoodsDeliveryHospitalVO vo, String... fieldNames) {
        super.entity2VO(entity, vo, fieldNames);
    }

    @Override
    public void vo2Entity(GoodsDeliveryHospitalVO vo, GoodsDeliveryHospital entity, String... fieldNames) {
        super.vo2Entity(vo, entity, fieldNames);
    }
}
