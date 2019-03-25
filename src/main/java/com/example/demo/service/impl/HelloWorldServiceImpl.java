/*
 * Copyright 2019 by 青岛比特信息科技有限公司 .
 * All rights reserved.
 */
package com.example.demo.service.impl;

import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuxin <br>
 * @date 2019/3/23 10:56 <br>
 * @project demo <br>
 * @description <br>
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Autowired
    private UserRepository userRepository;


}
