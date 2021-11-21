package com.study.java.pattern.builder.simple;

public class SimpleBuilderTest {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式");
        builder.addPpt("【PPT课件】");
        builder.addVideo("【录播视频】");

        Course course = builder.build();

        System.out.println(course);
    }
}
