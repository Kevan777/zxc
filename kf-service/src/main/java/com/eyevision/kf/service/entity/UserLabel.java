package com.eyevision.kf.service.entity;

import com.eyevision.framework.spring.mybatis.entity.AbstractUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "kf_user_label")
public class UserLabel extends AbstractUUIDBaseEntity {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "label_id")
    private Long labelId;
}
