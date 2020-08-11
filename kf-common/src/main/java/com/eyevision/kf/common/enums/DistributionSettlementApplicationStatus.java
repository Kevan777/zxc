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
 * @since 2019-05-13 21:20
 */
public enum DistributionSettlementApplicationStatus {
    WAIT_CHECK(1, "待审核"), WAIT_SETTLE(2, "待结算"), FINISH(3, "已结算");

    public final int value;
    public final String text;

    /**
     * @param value
     * @param text
     */
    DistributionSettlementApplicationStatus(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
