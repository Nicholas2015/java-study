package com.study.java.pattern.deletgate.demo;

public class Test {

    public static void main(String[] args) {
        new Boss().command("JavaDevelop",new Leader());
        new Boss().command("Design",new Leader());
        new Boss().command("Sale",new Leader());
    }
}
