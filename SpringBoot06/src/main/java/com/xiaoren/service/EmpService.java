package com.xiaoren.service;

import com.xiaoren.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();

    List<Emp> findByPage(Integer pageNum, Integer pageSize);

}
