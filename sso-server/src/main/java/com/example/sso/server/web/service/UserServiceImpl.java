package com.example.sso.server.web.service;

import com.example.sso.server.web.mapper.UserMapper;
import com.example.sso.server.web.param.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public LoginParam checkoutUser(String name, String password) {
        return userMapper.checkoutUser("123","123") ;
    }
}
