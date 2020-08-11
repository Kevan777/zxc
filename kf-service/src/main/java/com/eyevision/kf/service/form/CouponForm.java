package com.eyevision.kf.service.form;

public class CouponForm {
    private String name;
    private Integer status;
    private Long userId;
    private Long goodsId;
    private Boolean member;
    private Boolean userCanUsed;
    private String canUseOrderTypeStr;
    private Integer[] canUseOrderTypeArr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }

    public Boolean getUserCanUsed() {
        return userCanUsed;
    }

    public void setUserCanUsed(Boolean userCanUsed) {
        this.userCanUsed = userCanUsed;
    }

    public String getCanUseOrderTypeStr() {
        return canUseOrderTypeStr;
    }

    public void setCanUseOrderTypeStr(String canUseOrderTypeStr) {
        this.canUseOrderTypeStr = canUseOrderTypeStr;
    }

    public Integer[] getCanUseOrderTypeArr() {
        return canUseOrderTypeArr;
    }

    public void setCanUseOrderTypeArr(Integer[] canUseOrderTypeArr) {
        this.canUseOrderTypeArr = canUseOrderTypeArr;
    }
}
