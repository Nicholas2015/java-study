package com.study.java.pattern.singleton.lazy.inner;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏
 */
public class ReflectTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = LazyInnerClassSingleton.class;

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        // 强制访问私有属性/构造/方法
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();
        System.out.println(instance);
    }
}
