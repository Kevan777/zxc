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
 * @author chenys
 * @since 2018-03-07 15:07
 */
public enum Sex {
    MALE(1, "男"), FEMALE(2, "女");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    Sex(int value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * @return
     */
    public static Map<String, Integer> getReverseMap() {
        return Arrays.stream(Sex.values()).collect(Collectors.toMap(sex -> sex.text, sex -> sex.value));
    }

    /**
     * @return
     */
    public static Map<Integer, String> getMap() {
        return Arrays.stream(Sex.values()).collect(Collectors.toMap(sex -> sex.value, sex -> sex.text));
    }
}
