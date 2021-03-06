package com.study.java.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * 序列化破坏单例
 * 把内存中的对象的状态转换为字节码的形式
 * 把字节码通过IO输出流写入到磁盘上
 * 永久保存下来 ,持久化
 *
 * 反序列化
 * 将持久化的字节码内容，通过IO输入流读到内存中
 * 转换成一个java对象
 */
public class SerializabaleSingleton implements Serializable {

    public final static SerializabaleSingleton INSTANCE = new SerializabaleSingleton();

    private SerializabaleSingleton(){}

    public static SerializabaleSingleton getInstance(){
        return INSTANCE;
    }
}
