package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.common.support.EntityHandler;
import com.eyevision.framework.common.vo.VOUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.framework.spring.mybatis.IdGenerateUtil;
import com.eyevision.kf.service.entity.GoodsCategory;
import com.eyevision.kf.service.service.site.StGoodsCategoryService;
import com.eyevision.kf.service.vo.GoodsCategoryVO;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public class StGoodsCategoryServiceImpl extends AbstractMapperService<GoodsCategory, GoodsCategoryVO> implements StGoodsCategoryService {

    @Override
    protected Example formToExample(Object o) {
        return null;
    }

    @Override
    public List<GoodsCategoryVO> list(Long parentId) {
        Example example = new Example(entityClass);
        if (parentId == null) {
            example.createCriteria().andIsNull("parentId");
        }
        example.createCriteria().andEqualTo("parentId", parentId);
        List<GoodsCategory> list = mapper.selectByExample(example);
        return VOUtil.toVO(list, GoodsCategoryVO.class);
    }

    @Override
    public GoodsCategoryVO addGc(GoodsCategoryVO vo) {
        validate(vo);
        if (isExist(vo.getName(), vo.getParentId(), vo.getId())) {
            throw new ValidateException("商品分类已存在");
        }
        GoodsCategory entity = VOUtil.toEntity(vo, entityClass);
        EntityHandler.init(entity, getUser());
        mapper.insert(entity);
        entity.setId(IdGenerateUtil.current());
        return VOUtil.toVO(entity, voClass);
    }

    @Override
    public GoodsCategoryVO updateGc(GoodsCategoryVO vo) {
        validate(vo);
        vo.setParentId(null);
        GoodsCategory entity = mapper.selectByPrimaryKey(vo.getId());
        if (isExist(vo.getName(), entity.getParentId(), entity.getId())) {
            throw new ValidateException("商品分类已存在");
        }
        VOUtil.initEntity(vo, entity);
        EntityHandler.init(entity, getUser());
        mapper.updateByPrimaryKey(entity);
        return VOUtil.toVO(entity, voClass);
    }

    private boolean isExist(String name, Long parentId, Long id) {
        Example example = new Example(entityClass);
        Example.Criteria criteria = example.createCriteria()
                .andEqualTo("name", name);
        if (parentId != null) {
            criteria.andEqualTo("parentId", parentId);
        } else {
            criteria.andIsNull("parentId");
        }
        if (id != null) {
            example.and().andNotEqualTo("id", id);
        }
        return mapper.selectCountByExample(example) > 0;
    }
}
