package com.eyevision.kf.service.mapper;
import com.eyevision.kf.service.entity.GoodsPicture;
import com.eyevision.kf.service.vo.GoodsPictureVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface GoodsPictureMapper extends Mapper<GoodsPicture> {
     List<GoodsPictureVO> insertList(List<GoodsPicture> list);

}
