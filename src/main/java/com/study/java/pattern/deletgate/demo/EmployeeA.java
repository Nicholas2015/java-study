package com.study.java.pattern.deletgate.demo;

public class EmployeeA implements IEmployee {

    protected String goodAt = "Coding";

    @Override
    public void doing(String task) {
        System.out.println("I'm Employee A , 我擅长" + goodAt + ",现在开始做 " + task);
    }
}
