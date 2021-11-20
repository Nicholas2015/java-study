package com.study.java.pattern.singleton.lazy.simple;

import java.util.Objects;

/**
 * 优点：节省了内存，线程安全
 * 缺点：性能低
 */
public class LazySimpleSingleton2 {

    private static LazySimpleSingleton2 instance;

    private LazySimpleSingleton2(){}

    public synchronized static LazySimpleSingleton2 getInstance(){
        if (Objects.isNull(instance)) {
            instance = new LazySimpleSingleton2();
        }
        return instance;
    }
}
