package com.study.java.pattern.singleton.lazy.inner;

/**
 * classpath: LazyInnerClassSingleton.class
 *            LazyInnerClassSingleton$LazyHolder.class
 *            内部类延时加载
 * 优点：代码写法优雅，利用java本身语法特点，性能高，避免了内存浪费
 * 缺点：能够被反射破坏
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
    }

    private static LazyInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final  LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
