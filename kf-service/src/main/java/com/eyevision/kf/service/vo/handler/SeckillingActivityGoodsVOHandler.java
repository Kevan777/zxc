/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.vo.handler;


import com.eyevision.framework.common.vo.handler.VOHandler;
import com.eyevision.kf.service.entity.SeckillingActivityGoods;
import com.eyevision.kf.service.vo.SeckillingActivityGoodsVO;


/**
 * Description
 *
 * @author system
 * @since 2018-11-29 21:22
 */
public class SeckillingActivityGoodsVOHandler extends VOHandler<SeckillingActivityGoods, SeckillingActivityGoodsVO> {
    @Override
    public void entity2VO(SeckillingActivityGoods entity, SeckillingActivityGoodsVO vo, String... fieldNames) {
        super.entity2VO(entity, vo, fieldNames);
    }

    @Override
    public void vo2Entity(SeckillingActivityGoodsVO vo, SeckillingActivityGoods entity, String... fieldNames) {
        super.vo2Entity(vo, entity, fieldNames);
    }
}
