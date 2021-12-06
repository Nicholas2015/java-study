package com.study.java.pattern.composite.demo.transparent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Course extends CourseComponent{

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent component) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this.name + "(￥"+ this.price + "元)");
    }
}
