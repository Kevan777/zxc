package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "kf_goods")
public class Goods extends AbstractUUIDBaseEntity {
    /**
     * 名称
     */
    private String name;

    /**
     * 一级分类
     */
    private Long category1;

    /**
     * 二级分类
     */
    private Long category2;

    /**
     * 商品标签类型
     */
    @Column(name = "label_types")
    private String labelTypes;

    /**
     * 会员属性
     */
    @Column(name = "member_rights")
    private Integer memberRights;

    /**
     * 商品类型
     */
    private Integer type;

    /**
     * 限购数量
     */
    @Column(name = "limit_number")
    private Integer limitNumber;

    /**
     * 是否分销
     */
    private Boolean assignable;

    /**
     * 配送方式
     */
    @Column(name = "delivery_type")
    private Integer deliveryType;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 内容
     */
    private String content;

    /**
     * 销量
     */
    private Integer sales;

    @Column(name = "use_common_distribution_brokerage_rate")
    private Boolean useCommonDistributionBrokerageRate;

    @Column(name = "distribution_brokerage_rate")
    private Float distributionBrokerageRate;

    private Integer heat;

    @Transient
    private Integer number;

    @Transient
    private Boolean hasCollection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory1() {
        return category1;
    }

    public void setCategory1(Long category1) {
        this.category1 = category1;
    }

    public Long getCategory2() {
        return category2;
    }

    public void setCategory2(Long category2) {
        this.category2 = category2;
    }

    public String getLabelTypes() {
        return labelTypes;
    }

    public void setLabelTypes(String labelTypes) {
        this.labelTypes = labelTypes;
    }

    public Integer getMemberRights() {
        return memberRights;
    }

    public void setMemberRights(Integer memberRights) {
        this.memberRights = memberRights;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(Integer limitNumber) {
        this.limitNumber = limitNumber;
    }

    public Boolean getAssignable() {
        return assignable;
    }

    public void setAssignable(Boolean assignable) {
        this.assignable = assignable;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Boolean getUseCommonDistributionBrokerageRate() {
        return useCommonDistributionBrokerageRate;
    }

    public void setUseCommonDistributionBrokerageRate(Boolean useCommonDistributionBrokerageRate) {
        this.useCommonDistributionBrokerageRate = useCommonDistributionBrokerageRate;
    }

    public Float getDistributionBrokerageRate() {
        return distributionBrokerageRate;
    }

    public void setDistributionBrokerageRate(Float distributionBrokerageRate) {
        this.distributionBrokerageRate = distributionBrokerageRate;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Boolean getHasCollection() {
        return hasCollection;
    }

    public void setHasCollection(Boolean hasCollection) {
        this.hasCollection = hasCollection;
    }
}
