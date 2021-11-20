package com.study.java.pattern.singleton.lazy.inner;

import java.util.Objects;

/**
 * classpath: LazyInnerClassSingleton.class
 *            LazyInnerClassSingleton$LazyHolder.class
 *            内部类延时加载
 * 优点：代码写法优雅，利用java本身语法特点，性能高，避免了内存浪费，不能够被反射破坏
 * 缺点：代码不优雅
 * 解决反射破坏的问题
 */
public class LazyInnerClassSingleton2 {

    private LazyInnerClassSingleton2() {
        if (Objects.nonNull(LazyHolder.INSTANCE)) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static LazyInnerClassSingleton2 getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton2 INSTANCE = new LazyInnerClassSingleton2();
    }
}
