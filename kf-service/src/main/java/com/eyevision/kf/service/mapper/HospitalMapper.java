package com.eyevision.kf.service.mapper;
import com.eyevision.kf.service.entity.Hospital;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface HospitalMapper extends Mapper<Hospital> {
    @Select("select * from kf_hospital where id in (select hospital_id from kf_goods_delivery_hospital where goods_id = #{goodsId}) ")
    //@ResultMap("BaseResultMap")
    List<Hospital> selectByGoods(@Param("goodsId") Long goodsId);

    @Select("select name from kf_hospital where id = #{id}")
    String selectNameById(@Param("id") Long id);
}
