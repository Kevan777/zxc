/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.common.enums;

/**
 * Description
 *
 * @author huzq
 * @since 2018-11-26 22:24
 */
public enum GoodsLabelType {
    ZP_JYPS(1, "正品·假一赔十"), KJJYYPS(2, "可附近医院配送"),
    QTWLYTH(3, "7天无理由退换"), ESSXSFH(4, "24小时发货");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    GoodsLabelType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
