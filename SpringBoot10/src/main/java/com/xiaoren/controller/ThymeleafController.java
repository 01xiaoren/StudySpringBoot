package com.xiaoren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ThymeleafController {

    @RequestMapping("/indexShow")
    public String indexShow(Map<String, Object> map) {
        map.put("msg", "设置值");
        return "index";
    }
}
