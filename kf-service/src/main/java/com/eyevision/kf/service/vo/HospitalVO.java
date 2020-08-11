package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel
public class HospitalVO extends AbstractBaseVO<Long> {
    @NotNull
    @Size(max = 50)
    @ApiModelProperty("名称") private String name;
    @NotNull @Size(max = 10)
    @ApiModelProperty("省编码") private String provinceCode;
    @NotNull @Size(max = 10)
    @ApiModelProperty("市编码") private String cityCode;
    @Size(max = 10)
    @ApiModelProperty("区编码") private String districtCode;
    @Size(max = 255)
    @ApiModelProperty("地址") private String address;
    @ApiModelProperty("启用") private Boolean enabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
