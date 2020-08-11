package com.eyevision.kf.service.service.management.impl;
import com.eyevision.kf.service.service.management.MgCacheService;
import com.eyevision.kf.service.service.site.StHospitalService;
import com.eyevision.kf.service.vo.HospitalVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MgCacheServiceImpl implements MgCacheService {
    @Autowired
    private StHospitalService stHospitalService;

    @Cacheable(value = "hospital", key = "#siteCode")
    @Override
    public List<HospitalVO> getHospitals(String siteCode) {
        return stHospitalService.listAll();
    }

    @CacheEvict(value = "hospital", key = "#siteCode")
    @Override
    public void cleanHospitals(String siteCode) {

    }
}
