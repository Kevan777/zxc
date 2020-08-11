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
 * @since 2018-11-23 22:02
 */
public enum HospitalLevel {
    LEVEL_1(1, "一级"), LEVEL_2(2, "二级"), LEVEL_3(3, "三级");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    HospitalLevel(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
