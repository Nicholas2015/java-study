package com.study.java.pattern.composite.demo.transparent;

public class Test {

    public static void main(String[] args) {
        System.out.println("================Transparent===============");

        CourseComponent javaBase = new Course("Java入门",8280);
        CourseComponent ai = new Course("人工智能",8000);
        CourseComponent javaAdvance = new CoursePackage("Java高级",2);

        CourseComponent design = new Course("Java设计模式",800);
        CourseComponent source = new Course("源码分析",500);
        CourseComponent softSkill = new Course("软技能",150);

        javaAdvance.addChild(design);
        javaAdvance.addChild(source);
        javaAdvance.addChild(softSkill);

        CourseComponent catalog = new CoursePackage("根目录",1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(javaAdvance);

        catalog.print();
    }
}
