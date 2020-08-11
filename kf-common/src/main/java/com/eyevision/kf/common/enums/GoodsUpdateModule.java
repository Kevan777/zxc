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
 * @since 2018-11-28 14:23
 */
public enum GoodsUpdateModule {
    SAVE_GOODS(1, "保存商品"), SAVE_NORM(2, "保存规格"),
    SAVE_RELEVANT_GOODS(3, "保存相关商品"), SAVE_PICTURE(4, "保存图片");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    GoodsUpdateModule(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
