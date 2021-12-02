package com.study.java.pattern.flyweight.pool;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection = connectionPool.getConnection();
        System.out.println(connection);
    }
}
