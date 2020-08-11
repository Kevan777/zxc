/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.vo.handler;

import com.eyevision.framework.common.vo.handler.VOHandler;
import com.eyevision.kf.service.entity.GoodsNorm;
import com.eyevision.kf.service.vo.GoodsNormVO;


/**
 * Description
 *
 * @author system
 * @since 2018-11-26 21:55
 */
public class GoodsNormVOHandler extends VOHandler<GoodsNorm, GoodsNormVO> {
    @Override
    public void entity2VO(GoodsNorm entity, GoodsNormVO vo, String... fieldNames) {
        super.entity2VO(entity, vo, fieldNames);
    }

    @Override
    public void vo2Entity(GoodsNormVO vo, GoodsNorm entity, String... fieldNames) {
        super.vo2Entity(vo, entity, fieldNames);
    }
}
