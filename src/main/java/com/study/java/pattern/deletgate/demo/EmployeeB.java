package com.study.java.pattern.deletgate.demo;

public class EmployeeB implements IEmployee {
    protected String goodAt = "Drawing";

    @Override
    public void doing(String task) {
        System.out.println("I'm Employee B , 我擅长" + goodAt + ",现在开始做 " + task);
    }
}
