package com.study.java.pattern.singleton.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializabaleSingletonTest {

    public static void main(String[] args) {
        SerializabaleSingleton s1 = null;
        SerializabaleSingleton s2 = SerializabaleSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SerializabaleSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerializabaleSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializabaleSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
