package com.study.java.pattern.prototype.shallowcopy;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("Nicholas");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("书法");
        hobbies.add("美术");
        concretePrototype.setHobbies(hobbies);
        System.out.println(concretePrototype);
        // 拷贝原型对象
        ConcretePrototype clone = concretePrototype.clone();
        clone.getHobbies().add("技术控");
        System.out.println("原型对象：" + concretePrototype);
        System.out.println("克隆对象：" + clone);
        System.out.println(concretePrototype == clone);
        System.out.println("原型对象的爱好：" + concretePrototype.getHobbies());
        System.out.println("克隆对象的爱好：" + clone.getHobbies());
        // 引用对象，浅拷贝只会复制内存地址，不会复制值
        System.out.println(concretePrototype.getHobbies() == clone.getHobbies());
    }
}
