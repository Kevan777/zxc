package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.service.BaseService;
import com.eyevision.kf.common.enums.GoodsStatus;
import com.eyevision.kf.service.vo.GoodsNormVO;
import com.eyevision.kf.service.vo.GoodsPictureVO;
import com.eyevision.kf.service.vo.GoodsVO;

import java.util.List;


public interface StGoodsService extends BaseService<GoodsVO> {
    /**
     * @param form
     * @return
     */
   // Page<GoodsVO> paging(GoodsForm form);

    /**
     * @param id
     * @param byBusiness
     * @return
     */
    GoodsVO findDetail(Long id, boolean byBusiness);

    /**
     * @param vo
     * @return
     */
    GoodsVO save(GoodsVO vo);

    /**
     * @param id
     * @param urls
     * @param delPicIdStr
     * @return
     */
    List<GoodsPictureVO> savePictures(Long id, String urls, String delPicIdStr);

    /**
     * @param form
     * @return
     */
  //  List<GoodsVO> listGoods(GoodsForm form);

    /**
     * @param id
     * @param status
     * @return
     */
    List<GoodsNormVO> listNorm(Long id, GoodsStatus status);
}
