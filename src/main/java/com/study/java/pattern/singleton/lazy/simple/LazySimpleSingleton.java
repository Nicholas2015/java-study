package com.study.java.pattern.singleton.lazy.simple;

import java.util.Objects;

/**
 * 优点：节省了内存，
 * 缺点: 线程不安全
 * 线程不安全情况：多个线程同时操作判断instance为null的情况成立
 * 运行结果存在情况：
 * 1.同一个实例：a.正常顺序执行 b.后者覆盖前者情况
 * 2.不同的实例：同时进入条件，按顺序返回
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance(){
        if (Objects.isNull(instance)) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
