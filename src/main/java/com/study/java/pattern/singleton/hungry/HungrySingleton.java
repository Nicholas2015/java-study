package com.study.java.pattern.singleton.hungry;

/**
 * 饿汉式 常规饿汉式单例
 * 优点：执行效率高，性能高，没有任何的锁
 * 缺点：在某些情况下可能会内存浪费，批量使用的情况下
 *
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
