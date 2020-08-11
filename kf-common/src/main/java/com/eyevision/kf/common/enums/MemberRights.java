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
 * @since 2018-11-26 22:33
 */
public enum MemberRights {
    XSHYZK(1, "享受会员折扣"), JFDXZFJE(2, "积分抵消支付金额"), KYDJQ(3, "可用代金券");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    MemberRights(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
