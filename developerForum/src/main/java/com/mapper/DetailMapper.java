package com.mapper;

import com.pojo.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailMapper {

    //查询所有帖子
    List<Detail> queryAllDetail();

    //通过id删除帖子
    Integer deleteDetail(@Param("id") Long id);

    //新增帖子
    Integer insertDetail(Detail detail);
}
