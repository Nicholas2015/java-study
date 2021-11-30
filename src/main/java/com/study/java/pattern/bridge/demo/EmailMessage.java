package com.study.java.pattern.bridge.demo;

public class EmailMessage implements IMessage {

    @Override
    public void send(String msg, String receiver) {
        System.out.println("使用邮件消息发送" + msg + "给" + receiver);
    }
}
