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
 * @since 2018-11-26 22:36
 */
public enum GoodsType {
    NORMAL(1, "非租赁商品"), RENT(2, "租赁商品");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    GoodsType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
