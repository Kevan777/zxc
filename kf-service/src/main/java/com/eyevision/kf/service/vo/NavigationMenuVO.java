package com.eyevision.kf.service.vo;

import com.eyevision.framework.common.vo.AbstractBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@ApiModel
public class NavigationMenuVO extends AbstractBaseVO<Long> {
    @NotNull
    @Size(max = 20)
    @ApiModelProperty("名称") private String name;
    @NotNull
    @ApiModelProperty("排序号") private Integer sortNum;
    @NotNull
    @ApiModelProperty("状态") private Integer status;
    @ApiModelProperty("父级ID") private Long parentId;
    @ApiModelProperty("图标") private String icon;
    @NotNull
    @ApiModelProperty("商品分类ID") private Long goodsCategoryId;

    @ApiModelProperty("下级导航菜单") private List<NavigationMenuVO> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Long goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public List<NavigationMenuVO> getChildren() {
        return children;
    }

    public void setChildren(List<NavigationMenuVO> children) {
        this.children = children;
    }
}
