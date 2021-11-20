package com.study.java.pattern.singleton.lazy.doublecheck;

import java.util.Objects;

/**
 *
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public synchronized static LazyDoubleCheckSingleton getInstance(){
       synchronized (LazyDoubleCheckSingleton.class) {
           if (Objects.isNull(instance)) {
               instance = new LazyDoubleCheckSingleton();
           }
       }
        return instance;
    }
}
