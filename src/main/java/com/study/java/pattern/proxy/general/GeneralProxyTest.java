package com.study.java.pattern.proxy.general;

public class GeneralProxyTest {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
