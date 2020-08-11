package com.eyevision.kf.service.service.site;

import com.eyevision.framework.common.model.Page;
import com.eyevision.framework.common.model.PageForm;
import com.eyevision.framework.common.service.BaseService;

import com.eyevision.kf.service.form.CouponForm;
import com.eyevision.kf.service.vo.CouponVO;
import com.eyevision.kf.service.vo.GoodsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StCouponService extends BaseService<CouponVO> {
    void add(CouponVO vo);

    Page<CouponVO> paging(CouponForm form, PageForm pf);

    void on(Long id);

    void off(Long id);

    List<GoodsVO> listGoods(Long id);

    List<CouponVO> test(@Param("canUseOrderTypeArr")Integer[] arr);

}
