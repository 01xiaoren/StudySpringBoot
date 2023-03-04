package com.xiaoren.mapper;

import com.xiaoren.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<Emp> findAll();
}
