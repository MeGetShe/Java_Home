package com.mapper;


import com.pojo.RealEstate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RealEstate)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-03 13:59:22
 */
public interface RealEstateMapper {

    //房产信息查询
    List<RealEstate> queryAll();

    //根据产权人姓名模糊查询房产信息
    List<RealEstate> queryByName(@Param("name") String name);

    //根据产权人身份证号查询房产信息
    List<RealEstate> queryByCarId(@Param("cardId") String cardId);
}

