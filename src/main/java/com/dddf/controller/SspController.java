package com.dddf.controller;

import com.dddf.service.SspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SspController {
    @Autowired
    private SspService sspService;
    @GetMapping(value = "/getSsp")
    public String getSsp(String ssp_adslot_id){
        String serviceSsp = sspService.getSsp(ssp_adslot_id);
        return serviceSsp;

    }
}
