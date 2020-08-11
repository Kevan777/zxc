package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.kf.service.entity.Label;
import com.eyevision.kf.service.entity.UserLabel;
import com.eyevision.kf.service.mapper.UserLabelMapper;
import com.eyevision.kf.service.service.site.StLabelService;
import com.eyevision.kf.service.vo.LabelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
@Service
public class StLabelServiceImpl extends AbstractMapperService<Label, LabelVO> implements StLabelService {
    @Autowired
    private UserLabelMapper userLabelMapper;
    @Override
    public void add(LabelVO vo) {
        validate(vo);
        if (isExist(vo.getName(),null)) {
            throw new ValidateException("标签已存在");
        }
        super.add(vo);
    }

    @Override
    public void update(LabelVO vo) {
        validate(vo);
        if (isExist(vo.getName(), vo.getId())) {
            throw new ValidateException("标签已存在");
        }
        super.update(vo);
    }

    @Override
    public void deleteById(Serializable id) {
        UserLabel userLabel = new UserLabel();
        userLabel.setId((Long)id);
        if (userLabelMapper.selectCount(userLabel) > 0){
            throw new ValidateException("已有用户设置了该标签，无法删除");
        }
        super.deleteById(id);
    }

    @Override
    protected Example formToExample(Object o) {
        return null;
    }

    private boolean isExist(String name, Long id){
        Example example = new Example(entityClass);
       Example.Criteria criteria = example.createCriteria().andEqualTo("name",name);
        if (id != null) {
            criteria.andEqualTo("id", id);
        }
        return mapper.selectCountByExample(example) > 0;
    }
}
