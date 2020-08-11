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
 * @since 2019-05-08 15:55
 */
public enum PaymentOrderType {
    GOODS_ORDER(1, "商品订单"), GOODS_RENTING_RENEW_ORDER(2, "商品续租订单");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    PaymentOrderType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
