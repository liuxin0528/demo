/*
 * Copyright 2019 by 青岛比特信息科技有限公司 .
 * All rights reserved.
 */
package com.example.demo.controller;

import com.example.demo.entity.BaseArea;
import com.example.demo.service.BaseAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxin <br>
 * @date 2019/3/26 11:34 <br>
 * @project demo <br>
 * @description <br>
 */
@Controller
@RequestMapping("/baseArea")
public class BaseAreaController {

    @Autowired
    private BaseAreaService baseAreaService;

    @RequestMapping("/queryBaseAreaByAreaId")
    public String queryBaseAreaByAreaId(Model model){
        List<BaseArea> baseAreaList = new ArrayList<BaseArea>();
        for (int i = 0; i <10; i++) {
            BaseArea area = new BaseArea();
            area.setAreaCode("000000");
            area.setAreaName("中国");
            baseAreaList.add(area);
        }

        model.addAttribute("baseAreaList", baseAreaList);
        return "/baseArea/baseArea";
    }
}
