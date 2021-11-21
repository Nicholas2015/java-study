package com.study.java.pattern.builder.general;

public class GeneralBuilderTest {

    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        Product product = builder.build();
        System.out.println(product);
    }
}
