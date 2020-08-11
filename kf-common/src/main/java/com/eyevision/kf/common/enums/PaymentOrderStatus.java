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
 * @since 2019-04-26 14:31
 */
public enum PaymentOrderStatus {
    WAIT(0, "待支付"), FINISH(1, "已支付"), CANCEL(2, "已取消"), FAIL(3, "支付失败"), PAYING(4, "支付确认中"), EXPIRED(5, "已失效");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    PaymentOrderStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
