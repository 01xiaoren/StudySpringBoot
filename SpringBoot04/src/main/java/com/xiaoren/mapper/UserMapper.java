package com.xiaoren.mapper;

import com.xiaoren.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 如果不在MyApplication启动类上添加@MapperScan必须在AccountMapper接口上添加@Mapper注解。
 * 让spring知道是mapper接口
 */
@Mapper
public interface UserMapper {
    List<User> selectAll();
}
