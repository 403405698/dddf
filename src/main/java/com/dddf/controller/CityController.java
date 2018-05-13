package com.dddf.controller;

import com.dddf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@RestController
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping(value ="/getCity")
    public String getCity(String city_code){
        String serviceCity =cityService.getCity(city_code);
        return serviceCity;
    }

}
