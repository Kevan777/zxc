package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;

@ApiModel
public class GoodsVO extends AbstractBaseVO<Long> {
    @NotNull
    @Size(max = 255)
    @ApiModelProperty("名称") private String name;
    @NotNull
    @ApiModelProperty("一级分类") private Long category1;
    @NotNull
    @ApiModelProperty("二级分类") private Long category2;
    @Size(max = 20)
    @ApiModelProperty("商品标签类型") private String labelTypes;
    @ApiModelProperty("会员属性") private Integer memberRights;
    @NotNull
    @ApiModelProperty("商品类型") private Integer type;
    @ApiModelProperty("限购数量") private Integer limitNumber;
    @NotNull
    @ApiModelProperty("是否分销") private Boolean assignable;
    @NotNull
    @ApiModelProperty("配送方式") private Integer deliveryType;
    @NotNull
    @ApiModelProperty("状态") private Integer status;
    @NotNull
    @ApiModelProperty("内容") private String content;
    @Min(0)
    @ApiModelProperty("销量") private Integer sales;
    @NotNull
    @ApiModelProperty("使用全局分销佣金比") private Boolean useCommonDistributionBrokerageRate;
    @NotNull @Min(0) @Max(100)
    @ApiModelProperty("分销佣金比") private Float distributionBrokerageRate;
    @Min(1) @Max(5)
    @ApiModelProperty("热度") private Integer heat;
    @ApiModelProperty("库存数量") private Integer number;
    @ApiModelProperty("是否收藏") private Boolean hasCollection;

    @ApiModelProperty("商品图") private List<GoodsPictureVO> pictures;
    @NotNull @NotEmpty
    @ApiModelProperty("商品配送科室") private List<GoodsDeliveryHospitalVO> hospitals;
    @NotNull @NotEmpty
    @ApiModelProperty("商品规格") private List<GoodsNormVO> norms;
    @ApiModelProperty("相关商品[站点端参数]") private List<RelevantGoodsVO> relevantGoodsList;
    @ApiModelProperty("最小价格") private BigDecimal minPrice;
    @ApiModelProperty("最小秒杀价") private BigDecimal minSeckillingPrice;
    private Integer updateModule;
    private String delModuleIdStr;

    @ApiModelProperty("秒杀活动") private SeckillingActivityVO seckillingActivity;
    @ApiModelProperty("秒杀活动规格") private List<SeckillingActivityGoodsNormVO> seckillingActivityNorms;

    @ApiModelProperty("可领取优惠券列表") private List<CouponVO> canAcquireCouponList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory1() {
        return category1;
    }

    public void setCategory1(Long category1) {
        this.category1 = category1;
    }

    public Long getCategory2() {
        return category2;
    }

    public void setCategory2(Long category2) {
        this.category2 = category2;
    }

    public String getLabelTypes() {
        return labelTypes;
    }

    public void setLabelTypes(String labelTypes) {
        this.labelTypes = labelTypes;
    }

    public Integer getMemberRights() {
        return memberRights;
    }

    public void setMemberRights(Integer memberRights) {
        this.memberRights = memberRights;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(Integer limitNumber) {
        this.limitNumber = limitNumber;
    }

    public Boolean getAssignable() {
        return assignable;
    }

    public void setAssignable(Boolean assignable) {
        this.assignable = assignable;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Boolean getUseCommonDistributionBrokerageRate() {
        return useCommonDistributionBrokerageRate;
    }

    public void setUseCommonDistributionBrokerageRate(Boolean useCommonDistributionBrokerageRate) {
        this.useCommonDistributionBrokerageRate = useCommonDistributionBrokerageRate;
    }

    public Float getDistributionBrokerageRate() {
        return distributionBrokerageRate;
    }

    public void setDistributionBrokerageRate(Float distributionBrokerageRate) {
        this.distributionBrokerageRate = distributionBrokerageRate;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Boolean getHasCollection() {
        return hasCollection;
    }

    public void setHasCollection(Boolean hasCollection) {
        this.hasCollection = hasCollection;
    }

    public List<GoodsPictureVO> getPictures() {
        return pictures;
    }

    public void setPictures(List<GoodsPictureVO> pictures) {
        this.pictures = pictures;
    }

    public List<GoodsDeliveryHospitalVO> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<GoodsDeliveryHospitalVO> hospitals) {
        this.hospitals = hospitals;
    }

    public List<GoodsNormVO> getNorms() {
        return norms;
    }

    public void setNorms(List<GoodsNormVO> norms) {
        this.norms = norms;
    }

    public List<RelevantGoodsVO> getRelevantGoodsList() {
        return relevantGoodsList;
    }

    public void setRelevantGoodsList(List<RelevantGoodsVO> relevantGoodsList) {
        this.relevantGoodsList = relevantGoodsList;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMinSeckillingPrice() {
        return minSeckillingPrice;
    }

    public void setMinSeckillingPrice(BigDecimal minSeckillingPrice) {
        this.minSeckillingPrice = minSeckillingPrice;
    }

    public Integer getUpdateModule() {
        return updateModule;
    }

    public void setUpdateModule(Integer updateModule) {
        this.updateModule = updateModule;
    }

    public String getDelModuleIdStr() {
        return delModuleIdStr;
    }

    public void setDelModuleIdStr(String delModuleIdStr) {
        this.delModuleIdStr = delModuleIdStr;
    }

    public SeckillingActivityVO getSeckillingActivity() {
        return seckillingActivity;
    }

    public void setSeckillingActivity(SeckillingActivityVO seckillingActivity) {
        this.seckillingActivity = seckillingActivity;
    }

    public List<SeckillingActivityGoodsNormVO> getSeckillingActivityNorms() {
        return seckillingActivityNorms;
    }

    public void setSeckillingActivityNorms(List<SeckillingActivityGoodsNormVO> seckillingActivityNorms) {
        this.seckillingActivityNorms = seckillingActivityNorms;
    }

    public List<CouponVO> getCanAcquireCouponList() {
        return canAcquireCouponList;
    }

    public void setCanAcquireCouponList(List<CouponVO> canAcquireCouponList) {
        this.canAcquireCouponList = canAcquireCouponList;
    }
}
