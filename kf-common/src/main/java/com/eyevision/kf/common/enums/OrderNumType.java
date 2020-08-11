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
 * @since 2019-01-08 14:14
 */
public enum OrderNumType {
    GOODS_ORDER("GO", "商品订单"), PAYMENT_ORDER("PO", "支付订单"), GOODS_RENTING_RENEW_ORDER("GRRO", "续租订单"),
    GOODS_RETURN_APPLICATION("GRA", "归还申请单"), AFTER_SALE_APPLICATION("ASA", "售后申请单"),
    DISTRIBUTION_SETTLEMENT_APPLICATION("DSA", "分销结算申请");

    public final String value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    OrderNumType(String value, String text) {
        this.value = value;
        this.text = text;
    }
}
