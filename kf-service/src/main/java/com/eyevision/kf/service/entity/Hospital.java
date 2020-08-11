package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "kf_hospiatl")
public class Hospital extends AbstractUUIDBaseEntity {

    /**
     * 名称
     */
    private String name;

    /**
     * 省编码
     */
    @Column(name = "province_code")
    private String provinceCode;

    /**
     * 市编码
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * 区编码
     */
    @Column(name = "district_code")
    private String districtCode;

    /**
     * 地址
     */
    private String address;

    private Boolean enabled;

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
