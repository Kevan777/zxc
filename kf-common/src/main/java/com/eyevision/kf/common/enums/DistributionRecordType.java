package com.eyevision.kf.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description
 *
 * @author chenys
 * @since 2020-02-15 11:26
 */
public enum DistributionRecordType {
    GOODS_ORDER(1, "商品订单"), CANCEL_ORDER(2, "取消订单"), GOODS_RETURN(3, "商品退货");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    DistributionRecordType(int value, String text) {
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
