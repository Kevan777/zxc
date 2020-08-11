package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.service.BaseService;
import com.eyevision.kf.service.vo.GoodsCategoryVO;


import java.util.List;

public interface StGoodsCategoryService extends BaseService<GoodsCategoryVO> {

    List<GoodsCategoryVO> list(Long parentId);

    GoodsCategoryVO addGc(GoodsCategoryVO vo);

    GoodsCategoryVO updateGc(GoodsCategoryVO vo);
}
