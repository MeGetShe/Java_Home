package com.service.impl;

import com.pojo.SmbmsProvider;
import com.mapper.SmbmsProviderMapper;
import com.service.SmbmsProviderService;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

/**
 * (SmbmsProvider)表服务实现类
 *
 * @author makejava
 * @since 2024-08-02 16:28:38
 */
@Service("smbmsProviderService")
public class SmbmsProviderServiceImpl implements SmbmsProviderService {
    @Resource
    private SmbmsProviderMapper smbmsProviderMapper;

  
}
