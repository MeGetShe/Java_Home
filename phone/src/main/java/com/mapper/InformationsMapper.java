package com.mapper;

import com.pojo.Informations;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InformationsMapper {


    //查询全部资讯
    List<Informations> queryAll();

    //根据id查询资讯详情
    Informations queryDetailById(@Param("id") Long id);


}
