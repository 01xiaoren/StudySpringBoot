package com.xiaoren.controller;

import com.xiaoren.pojo.User;
import com.xiaoren.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
 @RequestMapping("/findAll")
 @ResponseBody
        public List<User> findAll(){
        return userService.select();
        }
}
