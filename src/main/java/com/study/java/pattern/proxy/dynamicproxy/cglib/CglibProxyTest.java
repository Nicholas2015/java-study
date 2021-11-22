package com.study.java.pattern.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyTest {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

//        Keon keon = (Keon) cglibProxy.getInstance(Keon.class);
//        keon.findLove();
//        keon.buyInsure();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Keon.class);
        enhancer.setCallback(new CglibProxy());
        Keon keon = (Keon) enhancer.create();
        keon.findLove();

//        Steve steve = (Steve) cglibProxy.getInstance(Steve.class);
//        steve.findLove();
//        steve.buyInsure();
    }
}
