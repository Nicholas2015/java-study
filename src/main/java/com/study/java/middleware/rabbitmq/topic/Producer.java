package com.study.java.middleware.rabbitmq.topic;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Producer {

    public static void main(String[] args) {
        // 1.创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        // 2.设置连接属性
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setUsername("guest");
        factory.setPassword("guest");

        Connection connection = null;
        Channel channel = null;
        final String queneName = Thread.currentThread().getName();
        try{
            // 3.获取连接
            connection = factory.newConnection("生产者");

            // 4. 从连接中创建通道
            channel = connection.createChannel();
            // 定义消息接受回调对象
            DeliverCallback callback = new DeliverCallback() {
                @Override
                public void handle(String s, Delivery delivery) throws IOException {
                    System.out.println(queneName + " 收到消息" + new String(s.getBytes(StandardCharsets.UTF_8)));
                }
            };
            // 消息内容
            String message = "Hello A";
            // 监听队列
            channel.basicPublish("topic-exchange","com.order.create",null,message.getBytes());
            System.out.println("消息" + message + " 已发送! ");

        } catch (Exception e) {

        }
    }
}
