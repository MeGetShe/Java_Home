package com.mapper;


import com.pojo.SmbmsBill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SmbmsBill)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-02 16:15:10
 */
public interface SmbmsBillMapper {

    List<SmbmsBill> queryBillByCodeAndName(@Param("billcode") String billcode, @Param("productname") String productname);
  

}

