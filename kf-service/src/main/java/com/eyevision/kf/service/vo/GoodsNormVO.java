package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@ApiModel
public class GoodsNormVO extends AbstractBaseVO<Long> {
    @ApiModelProperty("商品ID") private Long goodsId;
    @NotNull
    @Size(max = 255)
    @ApiModelProperty("名称") private String title;
    @NotNull
    @ApiModelProperty("市场价") private BigDecimal marketPrice;
    @NotNull
    @ApiModelProperty("价格") private BigDecimal price;
    @NotNull
    @ApiModelProperty("拼团价") private BigDecimal groupBuyingPrice;
    @NotNull @Min(0)
    @ApiModelProperty("押金") private BigDecimal deposit;
    @NotNull @Min(1)
    @ApiModelProperty("租借天数") private Integer rentDay;
    @NotNull @Min(0)
    @ApiModelProperty("逾期滞纳金") private BigDecimal overdueDayFee;
    @NotNull
    @ApiModelProperty("库存数量") private Integer number;
    @NotNull
    @ApiModelProperty("状态") private Integer status;

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
