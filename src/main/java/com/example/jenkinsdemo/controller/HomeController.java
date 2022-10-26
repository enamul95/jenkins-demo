package com.example.jenkinsdemo.controller;

import com.example.jenkinsdemo.responsemodel.ResponseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/")
public class HomeController {

    @GetMapping("/test")
    public ResponseModel getMessage(){
        ResponseModel model = new ResponseModel();
        model.setResponseCode("0");
        model.setResponseMessage("Welcome to Jenkins Demo cicd implemented successfully... Alhamdulillah.." +
                "Ashrafs confusion clearence..");
       return model;

    }
}
