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
 * @since 2019-05-06 15:35
 */
public enum DistributionLevel {
    LEVEL_1(1, "一级"), LEVEL_2(2, "二级");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    DistributionLevel(int value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * @param value
     * @return
     */
    public static String value2Text(int value) {
        for (DistributionLevel level : values()) {
            if (level.value == value) {
                return level.text;
            }
        }
        return null;
    }
}
