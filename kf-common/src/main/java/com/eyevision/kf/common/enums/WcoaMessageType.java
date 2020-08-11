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
 * @since 2018-11-23 14:54
 */
public enum WcoaMessageType {
    TEXT(0, "text"), // 文本
    NEWS(1, "news"), // 图文
    IMAGE(2, "image"), // 图片
    VIDEO(3, "video"), // 视频
    VOICE(4, "voice"); // 音频

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    WcoaMessageType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
