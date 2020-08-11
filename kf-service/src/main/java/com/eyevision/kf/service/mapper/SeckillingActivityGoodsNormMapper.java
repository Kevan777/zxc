package com.eyevision.kf.service.mapper;

import com.eyevision.framework.common.model.SimpleData;
import com.eyevision.kf.service.entity.SeckillingActivityGoodsNorm;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.math.BigDecimal;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface SeckillingActivityGoodsNormMapper extends Mapper<SeckillingActivityGoodsNorm> {
    List<SeckillingActivityGoodsNorm> selectByActivityAndGoods(@Param("activityId") Long activityId, @Param("goodsId") Long goodsId);

    @Select("select t2.goods_id, min(t1.price) as min_price from kf_seckilling_activity_goods_norm t1 left join kf_seckilling_activity_goods t2 on t2.id = t1.seckilling_activity_goods_id where t2.seckilling_activity_id = #{activityId} group by t2.goods_id")
    @ResultMap("MinPriceMap")
    List<SimpleData<Long, BigDecimal>> selectMinByActivity(@Param("activityId") Long activityId);
}
