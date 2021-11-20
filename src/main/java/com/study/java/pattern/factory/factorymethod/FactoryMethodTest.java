package com.study.java.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
