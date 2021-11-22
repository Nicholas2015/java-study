package com.study.java.pattern.proxy.customproxy;

public class CustomProxyTest {

    public static void main(String[] args) throws Exception {
        CustomsProxy customsProxy = new CustomsProxy();
        IPerson keon = customsProxy.getInstance(new Keon());
        keon.findLove();
    }
}
