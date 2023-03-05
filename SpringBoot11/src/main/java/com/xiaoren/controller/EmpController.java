package com.xiaoren.controller;

import com.xiaoren.pojo.Emp;
import com.xiaoren.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/showEmp")
    public String showEmp(Map<String, Object> map) {
        int i = 1 / 0;//模拟异常
        List<Emp> list = empService.findAll();
        map.put("empList", list);
        map.put("emp", list.get(0));
        System.out.println(list);//控制台
        return "showEmp";
    }
}
