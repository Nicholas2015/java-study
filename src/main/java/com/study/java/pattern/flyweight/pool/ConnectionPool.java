package com.study.java.pattern.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

    private Vector<Connection> pool;

    private int poolSize = 100;

    private String url = "jdbc:mysql://localhost:3306/mysql";

    private String username = "root";

    private String password = "111111";

    private String driverClassName = "com.mysql.cj.jdbc.Driver";

    public ConnectionPool() {
        this.pool = new Vector<>();
        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                Connection connection = DriverManager.getConnection(url, username, password);
                pool.add(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized Connection getConnection() {
        if (pool.size()>0) {
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }

    public synchronized void release(Connection connection) {
        pool.add(connection);
    }
}
