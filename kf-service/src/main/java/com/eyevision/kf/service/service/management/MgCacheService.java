package com.eyevision.kf.service.service.management;


import com.eyevision.kf.service.vo.HospitalVO;

import java.util.List;

public interface MgCacheService  {
    List<HospitalVO> getHospitals(String siteCode);

    void cleanHospitals(String siteCode);
}
