/*
 * Copyright 2019 by 青岛比特信息科技有限公司 .
 * All rights reserved.
 */
package com.example.demo.service.impl;

import com.example.demo.dao.BaseAreaMapper;
import com.example.demo.entity.BaseArea;
import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liuxin <br>
 * @date 2019/3/23 10:56 <br>
 * @project demo <br>
 * @description <br>
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Resource
    private BaseAreaMapper baseAreaMapper;

    @Override
    @Cacheable(value = "mysql:findById:baseArea", key = "100000")
    public BaseArea queryBaseAreaByAreaId() {
        return baseAreaMapper.selectByPrimaryKey("100000");
    }
}
