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
 * @since 2019-05-08 15:09
 */
public enum GoodsRentingRenewOrderStatus {
    WAIT_PAY(1, "待支付"), FINISH(2, "已完成"), CANCEL(3, "已取消");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    GoodsRentingRenewOrderStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
