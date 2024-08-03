package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.SmbmsBill;


/**
 * (SmbmsBill)表服务接口
 *
 * @author makejava
 * @since 2024-08-02 16:15:10
 */
public interface SmbmsBillService {


    PageInfo<SmbmsBill> queryBillByCodeAndName(Integer pageNo,Integer pageSize);
   

}
