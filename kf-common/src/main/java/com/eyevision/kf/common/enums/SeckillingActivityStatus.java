/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
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
 * @since 2018-11-26 22:16
 */
public enum SeckillingActivityStatus {
    ON_OFFER(1, "上架"), OUT_OF_STOCK(2, "下架");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    SeckillingActivityStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
