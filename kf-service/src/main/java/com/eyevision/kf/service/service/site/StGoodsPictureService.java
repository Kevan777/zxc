package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.service.BaseService;
import com.eyevision.kf.service.vo.GoodsPictureVO;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface StGoodsPictureService extends BaseService<GoodsPictureVO> {
    /**
     * @param goodsId
     * @return
     */
    List<GoodsPictureVO> listByGoodsId(Long goodsId);

    /**
     * @param goodsIds
     * @return
     */
    Map<Long, List<GoodsPictureVO>> mapByKeyGoods(Collection<Long> goodsIds);
}
