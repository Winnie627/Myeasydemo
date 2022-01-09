package com.example.myeasydemo.controller;

import com.example.myeasydemo.dao.UserDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    UserDao userDao;
    @GetMapping("/login")
    public String index(@Param("userName") String userName, @Param("email") String email) {
        System.out.println("用户名为："+userName);
        System.out.println("邮箱为："+email);
        int count = userDao.getUserByLoginName(userName,email);
        System.out.println(count);
        if(count>0){
            return "ok";
        }else {
            return "no";
        }
    }
}
