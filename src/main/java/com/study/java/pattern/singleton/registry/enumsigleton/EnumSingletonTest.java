package com.study.java.pattern.singleton.registry.enumsigleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) throws Exception {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());

        // 美剧
        Class clazz = EnumSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        Object o = constructor.newInstance();
        System.out.println(o);
    }
}
