/*
 * Copyright 2019 by 青岛比特信息科技有限公司 .
 * All rights reserved.
 */
package com.example.demo.controller;

import com.example.demo.entity.BaseArea;
import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuxin <br>
 * @date 2019/3/20 17:18 <br>
 * @project demo <br>
 * @description <br>
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }


    @RequestMapping("/queryBaseAreaByAreaId")
    public BaseArea queryBaseAreaByAreaId(String areaId){
        return helloWorldService.queryBaseAreaByAreaId(areaId);
    }

}
