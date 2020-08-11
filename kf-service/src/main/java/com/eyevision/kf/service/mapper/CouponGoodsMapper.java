package com.eyevision.kf.service.mapper;

import com.eyevision.kf.service.entity.CouponGoods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;


@org.apache.ibatis.annotations.Mapper
public interface CouponGoodsMapper extends Mapper<CouponGoods> {
    @Delete("delete from kf_coupon_goods  where coupon_id = #{couponId}")
    void deleteByCoupon(@Param("couponId") Long couponId);

}
