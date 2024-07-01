package com.example.provider;

import com.example.common.service.UserService;
import com.example.registry.LocalRegistry;
import com.example.server.HttpServer;
import com.example.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.registerService(UserService.class.getName(), UserServiceImpl.class);
        // 启动 Web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8888);
    }
}
