package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel
public class LabelVO extends AbstractBaseVO<Long> {
    @NotNull
    @Size(max = 50)
    @ApiModelProperty("标签名") private String name;
    @Size(max = 255)
    @ApiModelProperty("备注") private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
