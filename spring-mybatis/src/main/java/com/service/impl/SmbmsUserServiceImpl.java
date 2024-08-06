package com.service.impl;

import com.pojo.SmbmsUser;
import com.mapper.SmbmsUserMapper;
import com.service.SmbmsUserService;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

import java.util.List;

/**
 * (SmbmsUser)表服务实现类
 *
 * @author makejava
 * @since 2024-08-06 13:43:50
 */
@Service
public class SmbmsUserServiceImpl implements SmbmsUserService {
    @Resource
    private SmbmsUserMapper smbmsUserMapper;


    @Override
    public List<SmbmsUser> queryAll() {
        return smbmsUserMapper.queryAll();
    }
}
