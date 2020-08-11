/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.form;

import com.eyevision.framework.common.model.PageForm;

import javax.validation.constraints.NotNull;
import java.util.Collection;

/**
 * Description
 *
 * @author huzq
 * @since 2018-11-27 21:08
 */
public class GoodsForm extends PageForm {
    private Long id;
    private Integer type;
    @NotNull
    private Integer status;
    private Long category1;
    private Long category2;
    private Long category;
    private Collection<Long> categorys;
    private Long navigationMenuId;
    private String keyword;
    private boolean byRelevant;
    private Long userId;
    private boolean onlyCollection;
    private Long couponId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
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
    public Long getCategory() {
        return category;
    }
    public void setCategory(Long category) {
        this.category = category;
    }
    public Collection<Long> getCategorys() {
        return categorys;
    }
    public void setCategorys(Collection<Long> categorys) {
        this.categorys = categorys;
    }
    public Long getNavigationMenuId() {
        return navigationMenuId;
    }
    public void setNavigationMenuId(Long navigationMenuId) {
        this.navigationMenuId = navigationMenuId;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public boolean isByRelevant() {
        return byRelevant;
    }
    public void setByRelevant(boolean byRelevant) {
        this.byRelevant = byRelevant;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public boolean isOnlyCollection() {
        return onlyCollection;
    }
    public void setOnlyCollection(boolean onlyCollection) {
        this.onlyCollection = onlyCollection;
    }
    public Long getCouponId() {
        return couponId;
    }
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
}
