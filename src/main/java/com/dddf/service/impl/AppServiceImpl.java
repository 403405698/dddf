package com.dddf.service.impl;

import com.alibaba.fastjson.JSON;
import com.dddf.dao.AppDao;
import com.dddf.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class AppServiceImpl implements AppService {
    @Autowired
    private AppDao appDao;

    @Override
    public String getApp(String third_appsid) {
        List<Map<String, Object>> mathList = appDao.getApp(third_appsid);
        return JSON.toJSONString(mathList);
    }
}

