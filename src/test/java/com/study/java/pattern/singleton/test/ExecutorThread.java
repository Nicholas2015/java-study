package com.study.java.pattern.singleton.test;

import com.study.java.pattern.singleton.lazy.doublecheck.LazyDoubleCheckSingleton;

public class ExecutorThread implements Runnable{

    @Override
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
