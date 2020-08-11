package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "kf_relevant_goods")
public class RelevantGoods extends AbstractUUIDBaseEntity {
    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * 相关商品ID
     */
    @Column(name = "relevant_goods_id")
    private Long relevantGoodsId;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getRelevantGoodsId() {
        return relevantGoodsId;
    }

    public void setRelevantGoodsId(Long relevantGoodsId) {
        this.relevantGoodsId = relevantGoodsId;
    }
}
