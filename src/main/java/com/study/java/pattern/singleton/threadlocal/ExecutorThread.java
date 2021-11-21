package com.study.java.pattern.singleton.threadlocal;

import com.study.java.pattern.singleton.lazy.doublecheck.LazyDoubleCheckSingleton;

public class ExecutorThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
    }
}
