package com.study.java.pattern.deletgate.demo;

public class Boss {

    public void command(String task,Leader leader) {
        leader.doing(task);
    }
}
