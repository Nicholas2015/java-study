package com.study.java.pattern.singleton.registry.container;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object instance = null;
        if (!ioc.containsKey(className)) {
            instance = Class.forName(className).getDeclaredConstructor().newInstance();
            ioc.put(className, instance);
            return instance;
        } else {
            return ioc.get(className);
        }
    }
}
