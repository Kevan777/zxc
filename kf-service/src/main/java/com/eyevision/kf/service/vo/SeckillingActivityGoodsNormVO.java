package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel
public class SeckillingActivityGoodsNormVO extends AbstractBaseVO<Long> {
    @ApiModelProperty("秒杀活动商品ID") private Long seckillingActivityGoodsId;
    @NotNull
    @ApiModelProperty("商品规格ID") private Long goodsNormId;
    @NotNull
    @ApiModelProperty("价格") private BigDecimal price;
    @NotNull
    @ApiModelProperty("拼团价") private BigDecimal groupBuyingPrice;

    @ApiModelProperty("原规格") private GoodsNormVO originalNorm;

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

    public GoodsNormVO getOriginalNorm() {
        return originalNorm;
    }

    public void setOriginalNorm(GoodsNormVO originalNorm) {
        this.originalNorm = originalNorm;
    }
}
