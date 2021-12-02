package com.study.java.pattern.flyweight.jdk;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        // 享元
        System.out.println(s1 == s2); // true

        // 编译阶段转化成hello，非变量jdk底层做了优化
        String s3 = "he" + "llo";
        System.out.println(s1 == s3); // true

        String s4 = "hel" + new String("lo");
        System.out.println(s1 == s4); // false

        String s5 = new String("hello");
        System.out.println(s1 == s5); // false
        System.out.println(s4 == s5); // false

        // 获取s5常量的的值
        String s6 = s5.intern();
        System.out.println(s1 == s6); // true

        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        // 变量不做优化
        System.out.println(s1 == s9);
    }
}
