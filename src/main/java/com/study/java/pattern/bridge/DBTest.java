package com.study.java.pattern.bridge;

import java.sql.*;

public class DBTest {

    public static void main(String[] args) {
        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取连接
            // 主机：端口号/数据库
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
            // 得到执行sql语句的Statement
            Statement statement = connection.createStatement();
            // 执行sql返回结果
            ResultSet resultSet = statement.executeQuery("select * from user");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
