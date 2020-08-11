package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@ApiModel
public class CouponVO extends AbstractBaseVO<Long> {
    @NotNull
    @Size(max = 20)
    @ApiModelProperty("名称") private String name;
    @NotNull @Min(0)
    @ApiModelProperty("有效订单金额") private BigDecimal validOrderMoney;
    @NotNull @Min(0)
    @ApiModelProperty("优惠金额") private BigDecimal reduceMoney;
    @NotNull
    @ApiModelProperty("限制使用") private Boolean limitUse;
    @ApiModelProperty("状态") private Integer status;
    @NotNull
    @ApiModelProperty("领取开始日期") private Long acquireStartDate;
    @NotNull
    @ApiModelProperty("领取结束日期") private Long acquireEndDate;
    @NotNull
    @ApiModelProperty("有效规则") private Integer validRule;
    @ApiModelProperty("有效天数") private Integer validDay;
    @ApiModelProperty("有效开始日期") private Long validStartDate;
    @ApiModelProperty("有效结束日期") private Long validEndDate;
    @NotNull
    @ApiModelProperty("限制会员领取") private Boolean limitMemberAcquire;
    @NotNull @Min(1)
    @ApiModelProperty("可领取数量") private Integer canAcquireNum;
    @ApiModelProperty("已领取数量") private Integer hasAcquireNum;
    @NotNull
    @ApiModelProperty("可使用订单类型") private Integer canUseOrderType;

    private String goodsIdStr;
    @ApiModelProperty("商品") private List<GoodsVO> goodsList;
    @ApiModelProperty("已领取") private Boolean hasAcquire;

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

    public Long getAcquireStartDate() {
        return acquireStartDate;
    }

    public void setAcquireStartDate(Long acquireStartDate) {
        this.acquireStartDate = acquireStartDate;
    }

    public Long getAcquireEndDate() {
        return acquireEndDate;
    }

    public void setAcquireEndDate(Long acquireEndDate) {
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

    public Long getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(Long validStartDate) {
        this.validStartDate = validStartDate;
    }

    public Long getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Long validEndDate) {
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

    public String getGoodsIdStr() {
        return goodsIdStr;
    }

    public void setGoodsIdStr(String goodsIdStr) {
        this.goodsIdStr = goodsIdStr;
    }

    public List<GoodsVO> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsVO> goodsList) {
        this.goodsList = goodsList;
    }

    public Boolean getHasAcquire() {
        return hasAcquire;
    }

    public void setHasAcquire(Boolean hasAcquire) {
        this.hasAcquire = hasAcquire;
    }

    @Override
    public String toString() {
        return "CouponVO{" +
                "name='" + name + '\'' +
                ", validOrderMoney=" + validOrderMoney +
                ", reduceMoney=" + reduceMoney +
                ", limitUse=" + limitUse +
                ", status=" + status +
                ", acquireStartDate=" + acquireStartDate +
                ", acquireEndDate=" + acquireEndDate +
                ", validRule=" + validRule +
                ", validDay=" + validDay +
                ", validStartDate=" + validStartDate +
                ", validEndDate=" + validEndDate +
                ", limitMemberAcquire=" + limitMemberAcquire +
                ", canAcquireNum=" + canAcquireNum +
                ", hasAcquireNum=" + hasAcquireNum +
                ", canUseOrderType=" + canUseOrderType +
                ", goodsIdStr='" + goodsIdStr + '\'' +
                ", goodsList=" + goodsList +
                ", hasAcquire=" + hasAcquire +
                '}';
    }
}
