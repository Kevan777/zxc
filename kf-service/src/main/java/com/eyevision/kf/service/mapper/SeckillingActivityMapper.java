package com.eyevision.kf.service.mapper;
import com.eyevision.kf.service.entity.SeckillingActivity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

@org.apache.ibatis.annotations.Mapper
public interface SeckillingActivityMapper extends Mapper<SeckillingActivity> {
    long selectCountByCheck(@Param("id") Long id, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    @Select("select * from kf_seckilling_activity where start_time <= #{curTime} and end_time >= #{curTime} and status = 1 and id in (select seckilling_activity_id from kf_seckilling_activity_goods where goods_id = #{goodsId})")
    @ResultMap(value = "BaseResultMap")
    SeckillingActivity selectOneByGoods(@Param("goodsId") Long goodsId, @Param("curTime") Date curTime);

    SeckillingActivity selectOneByTab(@Param("tab") Integer tab, @Param("referenceTime") Date referenceTime);

    @Select("select count(id) from kf_seckilling_activity where start_time <= #{curTime} and end_time >= #{curTime} and status = 1 and id = (select seckilling_activity_id from kf_seckilling_activity_goods where id = (select seckilling_activity_goods_id from kf_seckilling_activity_goods_norm where id = #{goodsNormId}))")
    long selectCountBySeckillingActivityGoodsNorm(@Param("goodsNormId") Long goodsNormId, @Param("curTime") Date curTime);
}
