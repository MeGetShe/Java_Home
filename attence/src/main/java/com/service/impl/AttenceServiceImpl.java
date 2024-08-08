package com.service.impl;

import com.pojo.Attence;
import com.mapper.AttenceMapper;
import com.service.AttenceService;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

import java.util.List;

/**
 * (Attence)表服务实现类
 *
 * @author makejava
 * @since 2024-08-07 14:30:24
 */
@Service("attenceService")
public class AttenceServiceImpl implements AttenceService {
    @Resource
    private AttenceMapper attenceMapper;


    @Override
    public List<Attence> queryAll() {
        return attenceMapper.queryAll();
    }

    @Override
    public Integer insertById(Attence attence) {
        return attenceMapper.insertAtence(attence);
    }
}
