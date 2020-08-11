package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "kf_seckilling_activity_goods")
public class SeckillingActivityGoods extends AbstractUUIDEntity {
    /**
     * 秒杀活动ID
     */
    @Column(name = "seckilling_activity_id")
    private Long seckillingActivityId;

    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * 排序号
     */
    @Column(name = "sort_num")
    private Integer sortNum;

    public Long getSeckillingActivityId() {
        return seckillingActivityId;
    }

    public void setSeckillingActivityId(Long seckillingActivityId) {
        this.seckillingActivityId = seckillingActivityId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
