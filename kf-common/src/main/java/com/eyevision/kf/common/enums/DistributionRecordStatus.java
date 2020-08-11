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
 * @since 2019-05-06 21:38
 */
public enum DistributionRecordStatus {
    WAIT_WITHDRAWAL(1, "待提现"), HAS_WITHDRAWAL(2, "已提现");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    DistributionRecordStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
