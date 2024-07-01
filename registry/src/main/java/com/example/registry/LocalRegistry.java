package com.example.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册中心
 */
public class LocalRegistry {
    // 注册信息存储
    private static final Map<String, Class<?>> REGISTRY = new ConcurrentHashMap<>();

    // 注册服务
    public static void registerService(String serviceName, Class<?> service) {
        REGISTRY.put(serviceName, service);
    }

    // 获取服务
    public static Class<?> getService(String serviceName) {
        return REGISTRY.get(serviceName);
    }

    // 删除服务
    public static void removeService(String serviceName) {
        REGISTRY.remove(serviceName);
    }
}
