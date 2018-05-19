package com.dddf.controller;

import com.dddf.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    private AppService appService;

    @GetMapping(value = "getApp")
    public String getApp(String third_appsid) {
        String sspserviceApp = appService.getApp(third_appsid);
        return sspserviceApp;
    }
}
