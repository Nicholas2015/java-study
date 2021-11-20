package com.study.java.pattern.factory.simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
//        ICourse course = CourseFactory.create("java");
//        ICourse course = CourseFactory.create("com.study.java.pattern.factory.simple.JavaCourse");
        ICourse course = CourseFactory.create(JavaCourse.class);
        course.record();
    }
}
