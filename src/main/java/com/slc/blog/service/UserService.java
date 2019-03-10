package com.slc.blog.service;

import com.slc.blog.entity.User;
import com.slc.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper user;

    public String getUserById(int id){
        User user = this.user.selectUserById(id);
        return user.getName();
    }


}
