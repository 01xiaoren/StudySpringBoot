package com.xiaoren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @RequestMapping("/firstController")
    @ResponseBody
    public String firstController(){
        return "hello springboot";
    }
}