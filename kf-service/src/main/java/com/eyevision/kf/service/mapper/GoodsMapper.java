package com.eyevision.kf.service.mapper;
import com.eyevision.kf.service.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface GoodsMapper extends Mapper<Goods> {

    @Select("select * from kf_goods where id in (select goods_id from kf_coupon_goods where coupon_id = #{couponId})")
    @ResultMap("BaseResultMap")
    List<Goods> selectByCoupon(@Param("couponId") Long couponId);
}
