package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.SmbmsBillMapper;
import com.pojo.SmbmsBill;
import com.service.SmbmsBillService;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

import java.util.List;

/**
 * (SmbmsBill)表服务实现类
 *
 * @author makejava
 * @since 2024-08-02 16:15:10
 */
@Service("smbmsBillService")
public class SmbmsBillServiceImpl implements SmbmsBillService {
    @Resource
    private SmbmsBillMapper smbmsBillMapper;


    @Override
    public PageInfo<SmbmsBill> queryBillByCodeAndName(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
//        SmbmsBill smbmsBill = new SmbmsBill();
//        smbmsBill.setBillcode("");
//        smbmsBill.setProductname("");
        List<SmbmsBill> smbmsBills = smbmsBillMapper.queryBillByCodeAndName("", "");
        PageInfo<SmbmsBill> pageInfo = new PageInfo<>(smbmsBills);
        return pageInfo;
    }
}
