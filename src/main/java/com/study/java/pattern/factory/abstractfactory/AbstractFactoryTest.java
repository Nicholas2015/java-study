package com.study.java.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        CourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
