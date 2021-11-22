package com.study.java.pattern.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        Parent parent = new Parent(new Son());
        parent.findLove();
    }
}
