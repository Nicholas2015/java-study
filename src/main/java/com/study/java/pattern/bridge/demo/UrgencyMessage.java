package com.study.java.pattern.bridge.demo;

public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String msg, String receiver) {
        msg = "【加急】" + msg;
        super.sendMessage(msg,receiver);
    }

    public Object watch(String msgId) {
       return null;
    }
}
