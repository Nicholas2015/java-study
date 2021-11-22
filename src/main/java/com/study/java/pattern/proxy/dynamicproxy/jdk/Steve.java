package com.study.java.pattern.proxy.dynamicproxy.jdk;

public class Steve implements IPerson {
    @Override
    public void findLove() {
        System.out.println("Steve要求：学历高。");
    }

    @Override
    public void buyInsure() {
        System.out.println("200W");
    }
}
