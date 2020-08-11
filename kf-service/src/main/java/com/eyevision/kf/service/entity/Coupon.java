package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "kf_coupon")
public class Coupon extends AbstractUUIDBaseEntity {
    /**
     * 名称
     */
    private String name;

    /**
     * 有效订单金额
     */
    @Column(name = "valid_order_money")
    private BigDecimal validOrderMoney;

    /**
     * 优惠金额
     */
    @Column(name = "reduce_money")
    private BigDecimal reduceMoney;

    /**
     * 限制使用
     */
    @Column(name = "limit_use")
    private Boolean limitUse;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 领取开始日期
     */
    @Column(name = "acquire_start_date")
    private Date acquireStartDate;

    /**
     * 领取结束日期
     */
    @Column(name = "acquire_end_date")
    private Date acquireEndDate;

    /**
     * 有效规则
     */
    @Column(name = "valid_rule")
    private Integer validRule;

    /**
     * 有效天数
     */
    @Column(name = "valid_day")
    private Integer validDay;

    /**
     * 有效开始日期
     */
    @Column(name = "valid_start_date")
    private Date validStartDate;

    /**
     * 有效结束日期
     */
    @Column(name = "valid_end_date")
    private Date validEndDate;

    /**
     * 限制会员领取
     */
    @Column(name = "limit_member_acquire")
    private Boolean limitMemberAcquire;

    /**
     * 可领取数量
     */
    @Column(name = "can_acquire_num")
    private Integer canAcquireNum;

    /**
     * 已领取数量
     */
    @Column(name = "has_acquire_num")
    private Integer hasAcquireNum;

    /**
     * 可使用订单类型
     */
    @Column(name = "can_use_order_type")
    private Integer canUseOrderType;

    @Transient
    private Boolean hasAcquire;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValidOrderMoney() {
        return validOrderMoney;
    }

    public void setValidOrderMoney(BigDecimal validOrderMoney) {
        this.validOrderMoney = validOrderMoney;
    }

    public BigDecimal getReduceMoney() {
        return reduceMoney;
    }

    public void setReduceMoney(BigDecimal reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    public Boolean getLimitUse() {
        return limitUse;
    }

    public void setLimitUse(Boolean limitUse) {
        this.limitUse = limitUse;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAcquireStartDate() {
        return acquireStartDate;
    }

    public void setAcquireStartDate(Date acquireStartDate) {
        this.acquireStartDate = acquireStartDate;
    }

    public Date getAcquireEndDate() {
        return acquireEndDate;
    }

    public void setAcquireEndDate(Date acquireEndDate) {
        this.acquireEndDate = acquireEndDate;
    }

    public Integer getValidRule() {
        return validRule;
    }

    public void setValidRule(Integer validRule) {
        this.validRule = validRule;
    }

    public Integer getValidDay() {
        return validDay;
    }

    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    public Date getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(Date validStartDate) {
        this.validStartDate = validStartDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public Boolean getLimitMemberAcquire() {
        return limitMemberAcquire;
    }

    public void setLimitMemberAcquire(Boolean limitMemberAcquire) {
        this.limitMemberAcquire = limitMemberAcquire;
    }

    public Integer getCanAcquireNum() {
        return canAcquireNum;
    }

    public void setCanAcquireNum(Integer canAcquireNum) {
        this.canAcquireNum = canAcquireNum;
    }

    public Integer getHasAcquireNum() {
        return hasAcquireNum;
    }

    public void setHasAcquireNum(Integer hasAcquireNum) {
        this.hasAcquireNum = hasAcquireNum;
    }

    public Integer getCanUseOrderType() {
        return canUseOrderType;
    }

    public void setCanUseOrderType(Integer canUseOrderType) {
        this.canUseOrderType = canUseOrderType;
    }

    public Boolean getHasAcquire() {
        return hasAcquire;
    }

    public void setHasAcquire(Boolean hasAcquire) {
        this.hasAcquire = hasAcquire;
    }
}
