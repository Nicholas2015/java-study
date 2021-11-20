package com.study.java.pattern.singleton.lazy.doublecheck;

import java.util.Objects;

/**
 * 优点：性能提高，线程安全
 * 缺点：代码可读性差，理解难度加大。不够优雅
 */
public class LazyDoubleCheckSingleton4 {

    // 此处加上volatile关键字解决指令重排序的问题
    private volatile static LazyDoubleCheckSingleton4 instance;

    private LazyDoubleCheckSingleton4() {
    }

    public synchronized static LazyDoubleCheckSingleton4 getInstance() {
        // 第一次检查是否要阻塞
        if (Objects.isNull(instance)) {
            synchronized (LazyDoubleCheckSingleton4.class) {
                // 第二次检查是否要重新创建实例
                if (Objects.isNull(instance)) {
                    instance = new LazyDoubleCheckSingleton4();
                    // 原此处存在指令重排序的问题
                }
            }
        }
        return instance;
    }
}
