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
 * @since 2019-05-07 22:53
 */
public enum UserRentingGoodsStatus {
    RENTING(1, "租赁中"), RETURN_GOODS_APPLYING(2, "归还申请中"), WAIT_REFUND_DEPOSIT(3, "待退押金"),
    HAS_REFUNDED_DEPOSIT(4, "已退押金"), DISABLED(5, "已失效");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    UserRentingGoodsStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
