package com.study.java.pattern.proxy.dynamicproxy.jdk;

public class Keon implements IPerson {
    @Override
    public void findLove() {
        System.out.println("Keon要求：肤白貌美大长腿。");
    }

    @Override
    public void buyInsure() {
        System.out.println("100W");
    }
}
