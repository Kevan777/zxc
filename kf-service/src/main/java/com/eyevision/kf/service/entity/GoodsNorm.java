package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "kf_goods_norm")
public class GoodsNorm extends AbstractUUIDBaseEntity {
    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * 名称
     */
    private String title;

    /**
     * 市场价
     */
    @Column(name = "market_price")
    private BigDecimal marketPrice;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 拼团价
     */
    @Column(name = "group_buying_price")
    private BigDecimal groupBuyingPrice;

    private BigDecimal deposit;

    @Column(name = "rent_day")
    private Integer rentDay;

    @Column(name = "overdue_day_fee")
    private BigDecimal overdueDayFee;

    /**
     * 库存数量
     */
    private Integer number;

    /**
     * 状态
     */
    private Integer status;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getGroupBuyingPrice() {
        return groupBuyingPrice;
    }

    public void setGroupBuyingPrice(BigDecimal groupBuyingPrice) {
        this.groupBuyingPrice = groupBuyingPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public Integer getRentDay() {
        return rentDay;
    }

    public void setRentDay(Integer rentDay) {
        this.rentDay = rentDay;
    }

    public BigDecimal getOverdueDayFee() {
        return overdueDayFee;
    }

    public void setOverdueDayFee(BigDecimal overdueDayFee) {
        this.overdueDayFee = overdueDayFee;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
