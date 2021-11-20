package com.study.java.pattern.singleton.registry.enumsigleton;

/**
 * 优点:写法优雅
 * 缺点:如果存在大量创建的情况下，会造成内存浪费
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
