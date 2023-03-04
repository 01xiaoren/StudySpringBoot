package com.xiaoren.controller;

import com.xiaoren.pojo.Emp;
import com.xiaoren.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Emp> finAll() {
        return empService.findAll();
    }

    @RequestMapping("/findByPage/{pageNum}/{pageSize}")
    @ResponseBody
//public List<Emp> findByPage(@PathVariable("pageNum) Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
    //第一个参数页面，第二个参数指第几个数据开始几条数据
    public List<Emp> findByPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        return empService.findByPage(pageNum, pageSize);

    }
}