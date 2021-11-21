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
 *
 * 解决序列化破坏单例对象
 * 添加readResolve方法
 */
public class SerializabaleSingleton2 implements Serializable {

    public final static SerializabaleSingleton2 INSTANCE = new SerializabaleSingleton2();

    private SerializabaleSingleton2(){}

    public static SerializabaleSingleton2 getInstance(){
        return INSTANCE;
    }

    /**
     * 输入流中读取数据检查resolve方法
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }
}
