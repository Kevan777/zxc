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
 * @since 2018-11-23 22:03
 */
public enum HospitalGrade {
    GRADE_A(1, "甲等"), GRADE_B(2, "乙等"), GRADE_C(3, "丙等"), GRADE_S(4, "特等");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    HospitalGrade(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
