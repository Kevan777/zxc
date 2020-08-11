package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.support.validate.annotation.URL;
import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel
public class MainMenuVO extends AbstractBaseVO<Long> {
    @NotNull
    @Size(max = 20)
    @ApiModelProperty("名称") private String name;
    @ApiModelProperty("图标") private String icon;
    @NotNull @URL
    @ApiModelProperty("跳转链接") private String toUrl;
    @NotNull
    @ApiModelProperty("排序号") private Integer sortNum;
    @NotNull
    @ApiModelProperty("状态") private Integer status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getToUrl() {
        return toUrl;
    }

    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
