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
 * @since 2018-11-13 15:16
 */
public enum BusinessCode {
    SYSTEM("system", "管理系统"), SITE("site", "站点系统");

    public final String value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    BusinessCode(String value, String text) {
        this.value = value;
        this.text = text;
    }
}
