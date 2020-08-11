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
 * @since 2019-05-06 21:11
 */
public enum DistributionPartnerStatus {
    WAIT_CHECK(1, "待审核"), ENABLE(2, "已审核"), REJECT(3, "已驳回"), DISABLE(4, "已禁用");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    DistributionPartnerStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
