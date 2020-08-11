package com.eyevision.kf.service.mapper;


import com.eyevision.kf.service.entity.GoodsNorm;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface GoodsNormMapper extends Mapper<GoodsNorm> {

  //  List<SimpleData<Long, BigDecimal>> selectMinInGoodsIds(@Param("goodsIds") Collection<Long> goodsIds);
}
