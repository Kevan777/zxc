/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
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
 * @since 2018-11-23 16:04
 */
public enum WcoaMenuType {
    PARENT(0, "parent"), // 父级菜单
    VIEW(1, "view"), // 跳转链接
    CLICK(2, "click"); // 拉取系统消息

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    WcoaMenuType(int value, String text) {
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
