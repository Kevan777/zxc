package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.constant.enums.Status;
import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.common.support.EntityHandler;
import com.eyevision.framework.common.util.StringUtil;
import com.eyevision.framework.common.vo.VOUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.framework.spring.mybatis.IdGenerateUtil;
import com.eyevision.kf.service.entity.NavigationMenu;
import com.eyevision.kf.service.service.site.StNavigationMenuService;
import com.eyevision.kf.service.vo.NavigationMenuVO;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;

public class StNavigationMenuServiceImpl extends AbstractMapperService<NavigationMenu, NavigationMenuVO>
        implements StNavigationMenuService {
    @Override
    public void deleteById(Serializable id) {
        super.deleteById(id);
        NavigationMenu condition = new NavigationMenu();
        condition.setParentId((Long) id);
        mapper.delete(condition);
    }

    @Override
    public List<NavigationMenuVO> listMenu(Long parentId, String... selectProps) {
        return this.listMenu(parentId, null, selectProps);
    }

    @Override
    public List<NavigationMenuVO> listMenu(Long parentId, Status status, String... selectProps) {
        Example example = new Example(entityClass);
        Example.Criteria criteria = example.createCriteria();
        if (parentId == null) {
            criteria.andIsNull("parentId");
        } else {
            criteria.andEqualTo("parentId", parentId);
        }
        if (status != null) {
            criteria.andEqualTo("status", status);
        }
        example.selectProperties(selectProps);
        example.setOrderByClause("sort_num asc");
        List<NavigationMenu> list = mapper.selectByExample(example);
        return VOUtil.toVO(list, NavigationMenuVO.class);
    }

    @Override
    public NavigationMenuVO addMenu(NavigationMenuVO vo) {
        validateMenu(vo);
        if (isExist(vo.getName(), vo.getSortNum(), vo.getParentId(), null)) {
            throw new ValidateException("名称或排序号已存在");
        }
        NavigationMenu entity = VOUtil.toEntity(vo, entityClass);
        EntityHandler.init(entity, getUser());
        mapper.insert(entity);
        entity.setId(IdGenerateUtil.current());
        return VOUtil.toVO(entity, voClass);
    }

    @Override
    public NavigationMenuVO updateMenu(NavigationMenuVO vo) {
        NavigationMenu entity = mapper.selectByPrimaryKey(vo.getId());
        vo.setParentId(entity.getParentId());
        validateMenu(vo);
        if (isExist(vo.getName(), vo.getSortNum(), vo.getParentId(), vo.getId())) {
            throw new ValidateException("名称或排序号已存在");
        }
        String delIcon = StringUtil.isNotNull(vo.getIcon()) ? entity.getIcon() : null;
        VOUtil.initEntity(vo, entity);
        EntityHandler.init(entity, getUser());
        mapper.updateByPrimaryKey(entity);
        return VOUtil.toVO(entity, voClass);
    }

    @Override
    protected Example formToExample(Object o) {
        return null;
    }

    private boolean isExist(String name, Integer sortNum, Long parentId, Long id) {
        Example example = new Example(entityClass);
        example.createCriteria()
                .orEqualTo("name", name)
                .orEqualTo("sortNum", sortNum);
        if (parentId != null) {
            example.and().andEqualTo("parentId", parentId);
        } else {
            example.and().andIsNull("parentId");
        }
        if (id != null) {
            example.and().andNotEqualTo("id", id);
        }
        return  mapper.selectCountByExample(example) > 0;
    }

    private void validateMenu(NavigationMenuVO vo) {
        if (vo.getParentId() != null) {
            validate(vo);
        } else {
            validate(vo, "name", "sortNum", "status");
        }
    }
}
