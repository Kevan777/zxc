package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.constant.enums.Status;
import com.eyevision.framework.common.service.BaseService;
import com.eyevision.kf.service.vo.NavigationMenuVO;

import java.util.List;

public interface StNavigationMenuService extends BaseService<NavigationMenuVO> {
    List<NavigationMenuVO> listMenu(Long parentId, String... selectProps);

    List<NavigationMenuVO> listMenu(Long parentId, Status status, String... selectProps);

    NavigationMenuVO addMenu(NavigationMenuVO vo);

    NavigationMenuVO updateMenu(NavigationMenuVO vo);
}
