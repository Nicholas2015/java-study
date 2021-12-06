package com.study.java.pattern.composite.demo.transparent;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CoursePackage extends CourseComponent {

    private List<CourseComponent> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent component) {
        items.add(component);
    }

    @Override
    public void removeChild(CourseComponent component) {
        items.remove(component);
    }

    @Override
    public String getName(CourseComponent component) {
        return this.getName(component);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CourseComponent item : items) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
                for (Integer i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            item.print();
        }
    }
}
