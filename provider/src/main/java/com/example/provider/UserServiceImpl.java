package com.example.provider;

import com.example.common.model.User;
import com.example.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User returnUser(User user) {
        System.out.println("用户名："+user.getUserName());
        return user;
    }
}
