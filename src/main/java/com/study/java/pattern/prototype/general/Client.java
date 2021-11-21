package com.study.java.pattern.prototype.general;

public class Client {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("Nicholas");
        System.out.println(concretePrototype);
        // 拷贝原型对象
        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(clone);
    }
}
