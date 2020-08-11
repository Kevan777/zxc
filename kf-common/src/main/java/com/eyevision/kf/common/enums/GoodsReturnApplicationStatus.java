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
 * @since 2019-05-09 10:17
 */
public enum GoodsReturnApplicationStatus {
    WAIT_RECEIVE(3, "待商家收货"), WAIT_REFUND(4, "待退款"), HAS_REFUNDED(5, "已退款");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    GoodsReturnApplicationStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
