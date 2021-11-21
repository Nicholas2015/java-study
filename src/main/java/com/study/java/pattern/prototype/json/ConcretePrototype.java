package com.study.java.pattern.prototype.json;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.List;

/**
 * @author Administrator
 */
public class ConcretePrototype implements Serializable {

    private int age;

    private String name;

    private List<String> hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }

    public ConcretePrototype deepClone() throws IOException, ClassNotFoundException {
        String jsonString = JSON.toJSONString(this);
        return JSON.parseObject(jsonString,ConcretePrototype.class);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
