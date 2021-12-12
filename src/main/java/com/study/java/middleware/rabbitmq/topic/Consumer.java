package com.study.java.middleware.rabbitmq.topic;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Consumer {

    public static void main(String[] args) {
        new Thread(receive,"queue-1").start();
        new Thread(receive,"queue-2").start();
        new Thread(receive,"queue-3").start();

    }

    public static Runnable receive = new Runnable() {
        @Override
        public void run() {
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
                connection = factory.newConnection("消费者");

                // 4. 从连接中创建通道
                channel = connection.createChannel();
                // 定义消息接受回调对象
                DeliverCallback callback = new DeliverCallback() {
                    @Override
                    public void handle(String s, Delivery delivery) throws IOException {
                        System.out.println(queneName + " 收到消息" + new String(s.getBytes(),"UTF-8"));
                    }
                };
                // 监听队列
                channel.basicConsume(queneName, true, callback, new CancelCallback() {
                    @Override
                    public void handle(String s) throws IOException {
                    }
                });
            } catch (Exception e) {

            }
        }
    };
}
