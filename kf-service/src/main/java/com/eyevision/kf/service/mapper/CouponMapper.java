package com.eyevision.kf.service.mapper;

import com.eyevision.kf.service.entity.Coupon;
import com.eyevision.kf.service.form.CouponForm;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface CouponMapper extends Mapper<Coupon> {
    List<Coupon> test( @Param("canUseOrderTypeArr")Integer[] canUseOrderTypeArr);
    List<Coupon> selectByForm(CouponForm form);

    long selectCountByForm(CouponForm form);

    List<Coupon> selectByUserCanAcquire(CouponForm form);

    Coupon selectByCanUse(@Param("id") Long id, @Param("goodsId") Long goodsId, @Param("canUseOrderType") Integer canUseOrderType);
}
