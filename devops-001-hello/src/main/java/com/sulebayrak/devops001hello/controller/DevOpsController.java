package com.sulebayrak.devops001hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class DevOpsController {

    @GetMapping
    public String devopsHello(){
        return "Hello Devops:" + LocalDateTime.now();
    }

    @GetMapping("/info")
    public String Info(){
        return "DEVOPS INFO:" + LocalDateTime.now();
    }


}
