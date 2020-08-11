/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Description
 *
 * @author chenys
 * @since 2018-08-08 16:43
 */
@Configuration
@ConfigurationProperties("project.template")
public class TemplateConfig {
    private String wxOrderDeliveryByHoapitalMsgTpl;
    private String wxOrderDeliveryByExpressMsgTpl;
    private String wxAfterSaleCheckMsgTpl;
    private String wxOrderRefundMsgTpl;
    private String wxRentingExpireMsgTpl;
    private String wxShopReceivedMsgTpl;
    private String wxDistributionPassMsgTpl;

    public String getWxOrderDeliveryByHoapitalMsgTpl() {
        return wxOrderDeliveryByHoapitalMsgTpl;
    }

    public void setWxOrderDeliveryByHoapitalMsgTpl(String wxOrderDeliveryByHoapitalMsgTpl) {
        this.wxOrderDeliveryByHoapitalMsgTpl = wxOrderDeliveryByHoapitalMsgTpl;
    }

    public String getWxOrderDeliveryByExpressMsgTpl() {
        return wxOrderDeliveryByExpressMsgTpl;
    }

    public void setWxOrderDeliveryByExpressMsgTpl(String wxOrderDeliveryByExpressMsgTpl) {
        this.wxOrderDeliveryByExpressMsgTpl = wxOrderDeliveryByExpressMsgTpl;
    }

    public String getWxAfterSaleCheckMsgTpl() {
        return wxAfterSaleCheckMsgTpl;
    }

    public void setWxAfterSaleCheckMsgTpl(String wxAfterSaleCheckMsgTpl) {
        this.wxAfterSaleCheckMsgTpl = wxAfterSaleCheckMsgTpl;
    }

    public String getWxOrderRefundMsgTpl() {
        return wxOrderRefundMsgTpl;
    }

    public void setWxOrderRefundMsgTpl(String wxOrderRefundMsgTpl) {
        this.wxOrderRefundMsgTpl = wxOrderRefundMsgTpl;
    }

    public String getWxRentingExpireMsgTpl() {
        return wxRentingExpireMsgTpl;
    }

    public void setWxRentingExpireMsgTpl(String wxRentingExpireMsgTpl) {
        this.wxRentingExpireMsgTpl = wxRentingExpireMsgTpl;
    }

    public String getWxShopReceivedMsgTpl() {
        return wxShopReceivedMsgTpl;
    }

    public void setWxShopReceivedMsgTpl(String wxShopReceivedMsgTpl) {
        this.wxShopReceivedMsgTpl = wxShopReceivedMsgTpl;
    }

    public String getWxDistributionPassMsgTpl() {
        return wxDistributionPassMsgTpl;
    }

    public void setWxDistributionPassMsgTpl(String wxDistributionPassMsgTpl) {
        this.wxDistributionPassMsgTpl = wxDistributionPassMsgTpl;
    }
}
