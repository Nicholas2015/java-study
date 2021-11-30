package com.study.java.pattern.bridge.demo;

public abstract class AbstractMessage {

    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String msg, String receiver) {
        this.message.send(msg,receiver);
    }
}
