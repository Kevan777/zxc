package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@ApiModel
public class SeckillingActivityVO extends AbstractBaseVO<Long> {
    @NotNull
    @ApiModelProperty("开始时间") private Long startTime;
    @NotNull
    @ApiModelProperty("结束时间") private Long endTime;
    @NotNull
    @ApiModelProperty("状态") private Integer status;

    @NotNull @NotEmpty
    @ApiModelProperty("秒杀商品[站点端参数]") private List<SeckillingActivityGoodsVO> seckillingGoodsList;
    private String delGoodsIdStr;
    @ApiModelProperty("商品[用户端参数]") private List<GoodsVO> goodsList;

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SeckillingActivityGoodsVO> getSeckillingGoodsList() {
        return seckillingGoodsList;
    }

    public void setSeckillingGoodsList(List<SeckillingActivityGoodsVO> seckillingGoodsList) {
        this.seckillingGoodsList = seckillingGoodsList;
    }

    public String getDelGoodsIdStr() {
        return delGoodsIdStr;
    }

    public void setDelGoodsIdStr(String delGoodsIdStr) {
        this.delGoodsIdStr = delGoodsIdStr;
    }

    public List<GoodsVO> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsVO> goodsList) {
        this.goodsList = goodsList;
    }
}
