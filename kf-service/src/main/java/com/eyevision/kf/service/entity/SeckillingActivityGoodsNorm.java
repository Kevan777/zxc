package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "kf_seckilling_activity_goods_norm")
public class SeckillingActivityGoodsNorm extends AbstractUUIDBaseEntity {
    /**
     * 秒杀活动商品ID
     */
    @Column(name = "seckilling_activity_goods_id")
    private Long seckillingActivityGoodsId;

    /**
     * 商品规格ID
     */
    @Column(name = "goods_norm_id")
    private Long goodsNormId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 拼团价
     */
    @Column(name = "group_buying_price")
    private BigDecimal groupBuyingPrice;

    public Long getSeckillingActivityGoodsId() {
        return seckillingActivityGoodsId;
    }

    public void setSeckillingActivityGoodsId(Long seckillingActivityGoodsId) {
        this.seckillingActivityGoodsId = seckillingActivityGoodsId;
    }

    public Long getGoodsNormId() {
        return goodsNormId;
    }

    public void setGoodsNormId(Long goodsNormId) {
        this.goodsNormId = goodsNormId;
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
}
