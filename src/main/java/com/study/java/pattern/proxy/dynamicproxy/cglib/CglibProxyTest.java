package com.study.java.pattern.proxy.dynamicproxy.cglib;


import net.sf.cglib.core.DebuggingClassWriter;

/**
 * 此处如果使用JDK16
 * JEP 396会默认把--illegal-access参数设置为deny，即默认禁用访问封装的包以及反射其他模块，
 * 这样就会导致上面的异常，在此之前该参数默认值一直都是--illegal-access=permit，只会产生警告，而不会报错，
 * 所以如果是 Java 16 的话需要在执行 Java 程序时把--illegal-access设置为permit
 *
 * 此处如果使用JDK17
 * JEP 403直接把--illegal-access参数移除了，如果需要启用访问封装的包，
 * 需要在执行 Java 程序时加上选型
 * --add-opens java.base/java.lang=ALL-UNNAMED
 */
public class CglibProxyTest {

    public static void main(String[] args) {

        // cglib动态代理产生的类
        // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D://cglib_proxy_class");

        CglibProxy cglibProxy = new CglibProxy();

        Keon keon = (Keon) cglibProxy.getInstance(Keon.class);
        keon.findLove();

        System.out.println("------------------------------------------");

        Steve steve = (Steve) cglibProxy.getInstance(Steve.class);
        steve.findLove();
    }
}
