package com.example.sso.server.web.service;

import com.example.sso.server.web.param.LoginParam;

public interface UserService {
    LoginParam checkoutUser(String name, String password);
}
