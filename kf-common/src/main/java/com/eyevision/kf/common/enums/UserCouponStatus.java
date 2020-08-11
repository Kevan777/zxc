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
 * @since 2019-06-01 20:56
 */
public enum UserCouponStatus {
    UNUSED(1, "未使用"), USED(2, "已使用");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    UserCouponStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
