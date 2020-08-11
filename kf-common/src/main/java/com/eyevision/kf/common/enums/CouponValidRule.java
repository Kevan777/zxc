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
 * @since 2019-05-31 21:59
 */
public enum CouponValidRule {
    LIMIT_DAY(1, "限制有效天数"), LIMIT_DATE(2, "限制有效日期");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    CouponValidRule(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
