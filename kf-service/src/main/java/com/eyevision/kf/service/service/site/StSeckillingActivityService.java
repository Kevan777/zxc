package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.service.BaseService;
import com.eyevision.kf.service.vo.SeckillingActivityVO;


public interface StSeckillingActivityService extends BaseService<SeckillingActivityVO> {
    void save(SeckillingActivityVO vo);

    SeckillingActivityVO findDetail(Long id);

    void outOfStock(Long id);
}
