package com.dddf.controller;

import com.dddf.service.DddfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DddfController {
    @Autowired
    private DddfService dddfService;

    @GetMapping(value = "/hello")
    public String hello() {
        System.err.println("第一次提交");
        return dddfService.hello();
    }

    @GetMapping(value = "getImage")
    public String getImage(String type) {
        return dddfService.selectMaterial(type);
    }
    @GetMapping(value = "insertUser")
    public void insertUse(String testname, int age, int sex){
    //封装
        Map<String, Object> map = new HashMap<>();
        map.put("testname",testname);
        map.put("age",age);
        map.put("sex",sex);
        dddfService.insertUser(map);
    }
}