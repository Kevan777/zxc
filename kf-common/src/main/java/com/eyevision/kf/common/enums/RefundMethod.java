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
 * @since 2019-05-09 16:29
 */
public enum RefundMethod {
    AUTO(1, "自动退款"), MANUAL(2, "手动退款");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    RefundMethod(int value, String text) {
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
