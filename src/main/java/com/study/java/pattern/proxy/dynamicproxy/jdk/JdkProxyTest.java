package com.study.java.pattern.proxy.dynamicproxy.jdk;

public class JdkProxyTest {

    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        IPerson keon = jdkProxy.getInstance(new Keon());
        keon.findLove();
        keon.buyInsure();

        IPerson steve = jdkProxy.getInstance(new Keon());
        steve.findLove();
        steve.buyInsure();
    }
}
