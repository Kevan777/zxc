package com.eyevision.kf.common.enums;

/**
 * Description
 *
 * @author chenys
 * @since 2020-02-17 15:35
 */
public enum WcoaSceneType {
    GOODS_SHARING(1, "商品分享"), BUSINESS_CARD(2, "个人名片");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    WcoaSceneType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
