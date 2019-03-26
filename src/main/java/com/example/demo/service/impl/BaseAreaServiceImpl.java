/*
 * Copyright 2019 by 青岛比特信息科技有限公司 .
 * All rights reserved.
 */
package com.example.demo.service.impl;

import com.example.demo.dao.BaseAreaMapper;
import com.example.demo.entity.BaseArea;
import com.example.demo.service.BaseAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liuxin <br>
 * @date 2019/3/26 11:34 <br>
 * @project demo <br>
 * @description <br>
 */
@Service
public class BaseAreaServiceImpl implements BaseAreaService {

    @Resource
    private BaseAreaMapper baseAreaMapper;


    @Override
    public BaseArea queryBaseAreaByAreaId() {
        return baseAreaMapper.selectByPrimaryKey("100000");
    }
}
