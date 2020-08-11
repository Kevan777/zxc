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
 * @since 2018-12-03 11:11
 */
public enum SeckillingActivityTab {
    UNDERWAY(1, "疯抢中"), WILL_BEGIN(2, "即将开抢"), TOMORROW(3, "明日预告");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    SeckillingActivityTab(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
