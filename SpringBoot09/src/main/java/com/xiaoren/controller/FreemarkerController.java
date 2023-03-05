package com.xiaoren.controller;

import com.xiaoren.pojo.Emp;
import com.xiaoren.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FreemarkerController {
    @Autowired
    private EmpService empService;

    //FreeMarker在遍历list集合是
    @RequestMapping("/show")
    //ModelAndView构造方法可以指定返回的页面名称，
    public ModelAndView modelAndView() {
        ModelAndView mv = new ModelAndView();
        List<Emp> list = empService.select();
        mv.addObject("empList", list);//将数据添加到mv中
        mv.setViewName("showEmp");//设置返回页面
        return mv;
    }

    //FreeMarker在遍历map集合是,key必须是String

    @RequestMapping("/showEmpMap")
    public ModelAndView testMap() {
        ModelAndView mv = new ModelAndView();
        List<Emp> list = empService.select();
        Map<String, Emp> empMap = new HashMap<>();
        for (Emp emp : list) {
            empMap.put(emp.getEmpno().toString(), emp);
        }
        mv.addObject("empMap", empMap);
        mv.setViewName("showEmpMap");
        System.out.println(empMap);
        return mv;
    }

    //信息为null；查询信息有可能为null
    @RequestMapping("/showNull")
    //ModelAndView构造方法可以指定返回的页面名称，
    public ModelAndView modelAndViewnull() {
        ModelAndView mv = new ModelAndView();
        List<Emp> list = empService.select();
//        mv.addObject("empList", null);//将数据添加到mv中
        mv.addObject("empList", list);
        mv.setViewName("showEmpListNull");//设置返回页面
        return mv;
    }
}

