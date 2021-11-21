package com.study.java.pattern.prototype.singleton;

import java.io.*;
import java.util.List;

/**
 * @author Administrator
 */
public class ConcretePrototype1 implements Cloneable,Serializable {

    private int age;

    private String name;

    private List<String> hobbies;

    private static ConcretePrototype1 instance = new ConcretePrototype1();

    private ConcretePrototype1(){}

    public static ConcretePrototype1 getInstance(){
        return instance;
    }

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

    /**
     * 如果还是要实现clonable接口，将此处 super.clone() 替换成instance静态实例就可以解决单例被破坏的的问题
     * 原型和单例是互斥，不能同时存在
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public ConcretePrototype1 clone() throws CloneNotSupportedException {
        return (ConcretePrototype1) super.clone();
    }

    public ConcretePrototype1 deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (ConcretePrototype1) ois.readObject();
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
