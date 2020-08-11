package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "kf_label")
public class Label extends AbstractUUIDBaseEntity {
    private String name;

    private String remark;

    @Transient
    private Long userId;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
