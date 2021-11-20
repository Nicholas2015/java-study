package com.study.java.pattern.singleton.registry.container;

import java.lang.reflect.InvocationTargetException;

public class ContainerSingletonTest {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object instance = ContainerSingleton.getInstance("com.study.java.pattern.singleton.registry.container.Container");
        System.out.println(instance);
    }
}
