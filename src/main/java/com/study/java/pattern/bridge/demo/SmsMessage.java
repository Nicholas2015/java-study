package com.study.java.pattern.bridge.demo;

public class SmsMessage implements IMessage {

    @Override
    public void send(String msg, String receiver) {
        System.out.println("使用短信消息发送" + msg + "给" + receiver);
    }
}
