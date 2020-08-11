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
 * @since 2019-04-24 15:00
 */
public enum MemberLevel {
    LEVEL_0(0, "未激活"), LEVEL_1(1, "会员");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    MemberLevel(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
