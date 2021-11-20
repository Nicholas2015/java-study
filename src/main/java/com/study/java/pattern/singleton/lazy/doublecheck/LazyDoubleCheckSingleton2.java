package com.study.java.pattern.singleton.lazy.doublecheck;

import java.util.Objects;

/**
 *
 */
public class LazyDoubleCheckSingleton2 {

    private static LazyDoubleCheckSingleton2 instance;

    private LazyDoubleCheckSingleton2() {
    }

    public synchronized static LazyDoubleCheckSingleton2 getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (LazyDoubleCheckSingleton2.class) {
                instance = new LazyDoubleCheckSingleton2();
            }
        }
        return instance;
    }
}
