package com.study.java;

import java.util.Date;

public class Delegate {
    @FunctionalInterface
    interface MyHandler {
        String handle(int one, java.util.Date two);

    }

    String pleaseHandle(int one, Date two) {
        return one + ":" + two;
    }

    static void process(MyHandler myHandler) {
        System.out.println(myHandler.handle(2, new Date()));
    }

    public static void main(String[] args) {
        String hello = "Hello";
        MyHandler handler = (one, two) -> hello;
        MyHandler myHandler = new MyHandler(){
            @Override
            public String handle(int one, Date two) {
                return "Hello";
            }
        };
        Delegate delegate = new Delegate();
        process(handler);
        process(delegate::pleaseHandle);
    }
}
