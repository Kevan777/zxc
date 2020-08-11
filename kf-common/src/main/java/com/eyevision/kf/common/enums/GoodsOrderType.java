/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.common.enums;

import com.eyevision.framework.common.exception.ValidateException;

/**
 * Description
 *
 * @author huzq
 * @since 2019-04-25 21:19
 */
public enum GoodsOrderType {
    SINGLE(1, "单买"), GROUP(2, "团购"), ACTIVITY_SINGLE(3, "活动单买"), ACTIVITY_GROUP(4, "活动团购"), RENTING(5, "租赁");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    GoodsOrderType(int value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * @param value
     * @return
     */
    public static int toCouponOrderType(int value) {
        for (GoodsOrderType type : values()) {
            if (type.value == value) {
                return 1 << type.ordinal();
            }
        }
        throw new ValidateException("订单类型错误");
    }
}
