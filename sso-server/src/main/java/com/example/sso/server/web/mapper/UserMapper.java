package com.example.sso.server.web.mapper;

import com.example.sso.server.web.param.LoginParam;

public interface UserMapper {
    LoginParam checkoutUser(String name, String password);
}
