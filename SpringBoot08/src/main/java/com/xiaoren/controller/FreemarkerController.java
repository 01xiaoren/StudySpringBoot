package com.xiaoren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FreemarkerController {
    @RequestMapping("/save")

    public String freemarker(Map<String,Object> map) {
        map.put("name","张三");
        //返回文件模板
        return "show";
    }
}
