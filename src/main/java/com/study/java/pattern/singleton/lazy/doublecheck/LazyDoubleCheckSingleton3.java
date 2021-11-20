package com.study.java.pattern.singleton.lazy.doublecheck;

import java.util.Objects;

/**
 *
 */
public class LazyDoubleCheckSingleton3 {

    private static LazyDoubleCheckSingleton3 instance;

    private LazyDoubleCheckSingleton3() {
    }

    public synchronized static LazyDoubleCheckSingleton3 getInstance() {
        // 第一次检查是否要阻塞
        if (Objects.isNull(instance)) {
            synchronized (LazyDoubleCheckSingleton3.class) {
                // 第二次检查是否要重新创建实例
                if (Objects.isNull(instance)) {
                    instance = new LazyDoubleCheckSingleton3();
                    // 此处存在指令重排序的问题
                }
            }
        }
        return instance;
    }
}
