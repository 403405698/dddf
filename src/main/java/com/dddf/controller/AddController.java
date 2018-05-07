package com.dddf.controller;

import com.dddf.service.DddfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
@RestController
public class AddController {
    @Autowired
    private DddfService dddfService;

    @GetMapping(value = "/yeHello")
    public String  yeHello(){
        return dddfService.hello();
    }
}
*/
@RestController
@RequestMapping(value = "/learn")//这里，我们添加，这个类所有的请求都要经过learn才能进入
public class AddController {
    @Autowired
    private DddfService dddfService;

    @GetMapping(value = "/yeHello")
    public String yeHello() {
        return dddfService.hello();
    }

    /**
     * controller层
     * @param city_code
     * @return
     */
    @GetMapping(value = "/selectOrder")
    public String selectOrder(String city_code) {
        return dddfService.selectOrder(city_code);//返回请求
    }
}

