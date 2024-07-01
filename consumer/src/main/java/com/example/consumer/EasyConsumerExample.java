package com.example.consumer;

import com.example.common.model.User;
import com.example.common.service.UserService;
import com.example.proxy.ServiceProxyFactory;

public class EasyConsumerExample {
    public static void main(String[] args) {
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setUserName("testUserName");
        // 调用
        User newUser = userService.returnUser(user);
        if (newUser != null) {
            System.out.println(newUser.getUserName());
        } else {
            System.out.println("newUser is null");
        }
    }
}
