/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.vo.handler;

import com.eyevision.framework.common.util.StringUtil;
import com.eyevision.framework.common.vo.handler.VOHandler;
import com.eyevision.framework.spring.core.SpringContextUtil;
import com.eyevision.framework.third.ucloud.UFileApi;
import com.eyevision.framework.third.ucloud.UFileConfig;
import com.eyevision.kf.service.entity.GoodsPicture;
import com.eyevision.kf.service.vo.GoodsPictureVO;


/**
 * Description
 *
 * @author system
 * @since 2018-11-26 21:55
 */
public class GoodsPictureVOHandler extends VOHandler<GoodsPicture, GoodsPictureVO> {
    @Override
    public void entity2VO(GoodsPicture entity, GoodsPictureVO vo, String... fieldNames) {
        super.entity2VO(entity, vo, fieldNames);
        if (StringUtil.isNotNull(entity.getUrl())) {
            UFileApi uFileApi = SpringContextUtil.getBean(UFileApi.class);
            UFileConfig uFileConfig = SpringContextUtil.getBean(UFileConfig.class);
            vo.setUrl(uFileApi.getFileUrls(uFileConfig, entity.getUrl()));
        }
    }

    @Override
    public void vo2Entity(GoodsPictureVO vo, GoodsPicture entity, String... fieldNames) {
        super.vo2Entity(vo, entity, fieldNames);
    }
}
