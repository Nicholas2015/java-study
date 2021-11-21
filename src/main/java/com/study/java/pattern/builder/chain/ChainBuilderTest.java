package com.study.java.pattern.builder.chain;

public class ChainBuilderTest {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式").addPpt("【PPT课件】").addVideo("【录播视频】");

        Course course = builder.build();

        System.out.println(course);
    }
}
