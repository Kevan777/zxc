package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.common.model.Page;
import com.eyevision.framework.common.model.PageForm;
import com.eyevision.framework.common.support.EntityHandler;
import com.eyevision.framework.common.util.StringUtil;
import com.eyevision.framework.common.vo.VOUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.kf.service.entity.MainMenu;
import com.eyevision.kf.service.service.site.StMainMenuService;
import com.eyevision.kf.service.vo.MainMenuVO;
import tk.mybatis.mapper.entity.Example;

public class StMainMenuServiceImpl extends AbstractMapperService<MainMenu, MainMenuVO>
        implements StMainMenuService {
    @Override
    public void add(MainMenuVO vo) {
        validate(vo);
        if (isExist(vo.getName(), vo.getSortNum(), null)) {
            throw new ValidateException("排序号已存在");
        }
        super.add(vo);
    }

    @Override
    public void update(MainMenuVO vo) {
        validate(vo);
        if (isExist(vo.getName(), vo.getSortNum(), vo.getId())) {
            throw new ValidateException("排序号已存在");
        }
        MainMenu entity =  mapper.selectByPrimaryKey(vo.getId());
        if (entity == null) {
            throw new ValidateException(NOT_EXSIT_ERROR);
        }
        String delIcon = StringUtil.isNotNull(vo.getIcon()) ? entity.getIcon() : null;
        VOUtil.initEntity(vo, entity);
        EntityHandler.init(entity, getUser());
        mapper.updateByPrimaryKey(entity);
    }

    @Override
    public Page<MainMenuVO> paging(Object form, PageForm pf) {
        pf.setSort("sort_num");
        pf.setOrder("asc");
        return super.paging(form, pf);
    }

    @Override
    protected Example formToExample(Object form) {
        String keyWord = (String) form;
        Example example = new Example(entityClass);
        if (StringUtil.isNotNull(keyWord)) {
            example.createCriteria().andLike("keyWord", "%" + keyWord + "%");
        }
        return example;
    }

    private boolean isExist(String name, Integer sortNum, Long id) {
        Example example = new Example(entityClass);
        example.createCriteria()
               .orEqualTo("name", name)
               .orEqualTo("sortNum", sortNum);
        if (id != null) {
            example.and().andNotEqualTo("id", id);
        }
        return mapper.selectCountByExample(example) > 0;

    }
}
