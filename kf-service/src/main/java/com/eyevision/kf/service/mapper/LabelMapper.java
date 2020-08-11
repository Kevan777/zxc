package com.eyevision.kf.service.mapper;

import com.eyevision.kf.service.entity.Label;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Collection;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface LabelMapper extends Mapper<Label> {
    List<Label> selectInUserIds(@Param("userIds") Collection<Long> userIds);
}
