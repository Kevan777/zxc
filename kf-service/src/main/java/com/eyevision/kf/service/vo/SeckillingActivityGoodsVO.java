package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@ApiModel
public class SeckillingActivityGoodsVO extends AbstractBaseVO<Long> {
    @ApiModelProperty("秒杀活动ID") private Long seckillingActivityId;
    @NotNull
    @ApiModelProperty("商品ID") private Long goodsId;
    @ApiModelProperty("排序号") private Integer sortNum;

    @ApiModelProperty("商品名称") private String goodsName;
    @NotNull @NotEmpty
    @ApiModelProperty("规格") private List<SeckillingActivityGoodsNormVO> norms;

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public List<SeckillingActivityGoodsNormVO> getNorms() {
        return norms;
    }

    public void setNorms(List<SeckillingActivityGoodsNormVO> norms) {
        this.norms = norms;
    }
}
