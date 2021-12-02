package com.study.java.pattern.flyweight.jdk;

/**
 * valueOf使用到了享元模式，使用到了缓存池
 * Integer、Long、Short取值范围在-128~127之间
 */
public class IntegerTest {


    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        // true
        System.out.println(a == b);

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        System.out.println(c == d);
    }
}
