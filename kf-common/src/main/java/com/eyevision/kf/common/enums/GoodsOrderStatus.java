/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description
 *
 * @author huzq
 * @since 2019-04-25 17:21
 */
public enum GoodsOrderStatus {
    WAIT_PAY(1, "待付款"), WAIT_DELIVERY(2, "待发货"), WAIT_RECEIVE(3, "待收货"),
    FINISH(4, "已完成"), CANCEL(5, "已取消"), CANCEL_WAIT_REFUND(6, "已取消待退款");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    GoodsOrderStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * @return
     */
    public static Map<Integer, String> toMap() {
        return Arrays.stream(values()).collect(Collectors.toMap(temp -> temp.value, temp -> temp.text));
    }
}
