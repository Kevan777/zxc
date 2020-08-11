package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "kf_goods_picture")
public class GoodsPicture extends AbstractUUIDBaseEntity {
    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * 链接
     */
    private String url;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
