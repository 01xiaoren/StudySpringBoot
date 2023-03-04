package com.xiaoren.service.impl;

import com.xiaoren.mapper.UserMapper;
import com.xiaoren.pojo.User;
import com.xiaoren.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> select() {
        return userMapper.findAll();
    }
}
