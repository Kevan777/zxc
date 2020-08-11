package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.common.support.EntityHandler;
import com.eyevision.framework.common.util.StringUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.kf.service.entity.Hospital;
import com.eyevision.kf.service.form.HospitalForm;
import com.eyevision.kf.service.service.management.MgCacheService;
import com.eyevision.kf.service.service.site.StHospitalService;
import com.eyevision.kf.service.util.SiteManager;
import com.eyevision.kf.service.vo.HospitalVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
@Service
public class StHospitalServiceImpl extends AbstractMapperService<Hospital, HospitalVO> implements StHospitalService {
    @Autowired
    private MgCacheService mgCacheService;

    @Override
    public void add(HospitalVO vo) {
        validate(vo);
        if (isExist(vo)) {
            throw new ValidateException("医院已存在");
        }
        vo.setEnabled(true);
        super.add(vo);
        mgCacheService.cleanHospitals(SiteManager.getCode());
    }

    @Override
    public void update(HospitalVO vo) {
        validate(vo);
        if (isExist(vo)) {
            throw  new ValidateException("医院已存在");
        }
        super.update(vo);
        mgCacheService.cleanHospitals(SiteManager.getCode());
    }

    @Override
    protected Example formToExample(Object form) {
        HospitalForm hospitalForm = (HospitalForm) form;
        Example example = new Example(entityClass);
        Example.Criteria criteria = example.createCriteria();
        if (hospitalForm.getProvinceCode() != null) {
            criteria.andEqualTo("provinceCode", hospitalForm.getProvinceCode());
        }
        if (hospitalForm.getCityCode() != null) {
            criteria.andEqualTo("cityCode", hospitalForm.getCityCode());
        }
        if (hospitalForm.getDistrictCode() != null) {
            criteria.andEqualTo("districtCode", hospitalForm.getDistrictCode());
        }
        if (StringUtil.isNotNull(hospitalForm.getKeyword())) {
            String keyWord = "%" + hospitalForm.getKeyword() + "%";
            criteria.andLike("name", keyWord);
        }
        return example;
    }

    @Override
    public void updateEnabled(Long id, boolean enabled) {
        Hospital hospital = new Hospital();
        hospital.setId(id);
        hospital.setEnabled(enabled);
        EntityHandler.init(hospital, getUser());
        mapper.updateByPrimaryKeySelective(hospital);
        mgCacheService.cleanHospitals(SiteManager.getCode());
    }

    private boolean isExist(HospitalVO vo) {
        Example example = new Example(entityClass);
        example.createCriteria().andEqualTo("name", vo.getName());
        if (vo.getId() != null) {
            example.and().andNotEqualTo("id", vo.getId());
        }
        return mapper.selectCountByExample(example) > 0;
    }
}
