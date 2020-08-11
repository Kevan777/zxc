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
 * @since 2018-11-26 22:39
 */
public enum DeliveryType {
    EXEMPTION_POSTAGE(1, "快递(包邮)"), NEED_POSTAGE(2, "快递(不包邮)"), NEARBY_HOSPITAL(3, "附近医院配送");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    DeliveryType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
