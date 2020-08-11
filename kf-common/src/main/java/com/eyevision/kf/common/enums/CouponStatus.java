/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
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
 * @since 2019-05-31 21:50
 */
public enum CouponStatus {
    OFF(1, "未开启"), ON(2, "已开启");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    CouponStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
