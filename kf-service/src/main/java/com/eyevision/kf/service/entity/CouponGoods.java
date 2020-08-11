package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "kf_coupon_goods")
public class CouponGoods extends AbstractUUIDEntity {
    /**
     * 优惠券ID
     */
    @Column(name = "coupon_id")
    private Long couponId;

    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Long goodsId;

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}
