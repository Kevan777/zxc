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
 * @since 2019-05-24 22:47
 */
public enum MicroActivityStage {
    NOT_STARTED(1, "未开始"), UNDERWAY(2, "进行中"), END(3, "已结束");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    MicroActivityStage(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
