package com.study.java.pattern.bridge.demo;

public class NormalMessage extends AbstractMessage {

    public NormalMessage(IMessage message) {
        super(message);
    }
}
