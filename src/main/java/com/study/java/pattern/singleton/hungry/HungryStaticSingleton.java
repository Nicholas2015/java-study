package com.study.java.pattern.singleton.hungry;

/**
 * 类加载顺序:
 * 先静态后动态
 * 先上后下
 * 先属性后方法
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
