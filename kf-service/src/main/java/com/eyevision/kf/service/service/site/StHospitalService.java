package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.service.BaseService;
import com.eyevision.kf.service.vo.HospitalVO;

public interface StHospitalService extends BaseService<HospitalVO> {
    void updateEnabled(Long id, boolean enabled);
}
