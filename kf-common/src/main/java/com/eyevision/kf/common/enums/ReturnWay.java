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
 * @since 2019-05-12 00:23
 */
public enum ReturnWay {
    PERSONALLY(1, "亲自退回"), EXPRESS(2, "快递退回");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    ReturnWay(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
