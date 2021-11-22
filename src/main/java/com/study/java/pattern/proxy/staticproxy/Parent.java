package com.study.java.pattern.proxy.staticproxy;

public class Parent implements IPerson {

    private Son son;

    public Parent(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父母开始物色");
        son.findLove();
        System.out.println("儿子开始交往");
    }
}
