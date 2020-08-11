package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@ApiModel
public class RelevantGoodsVO extends AbstractBaseVO<Long> {
    @ApiModelProperty("商品ID") private Long goodsId;
    @NotNull
    @ApiModelProperty("相关商品ID") private Long relevantGoodsId;

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
