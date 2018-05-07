package com.dddf.controller;

import com.dddf.service.DddfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
public class AddController{
    @Autowired
   private DddfService dddfService;
    @GetMapping(value ="/yeHello")
    public String yeHello(){
        return dddfService.hello();
    }
}

