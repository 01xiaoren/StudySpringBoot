package com.xiaoren.controller;

import com.xiaoren.pojo.Emp;
import com.xiaoren.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/select")
    @ResponseBody
    public List<Emp> findAll() {
        return empService.select();
    }


    @RequestMapping("/selectByPage/{pageNum}/{pageSize}")
    @ResponseBody
    public List<Emp> findByPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        return empService.findByPage(pageNum, pageSize);
    }
}
