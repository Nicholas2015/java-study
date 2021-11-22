package com.study.java.pattern.proxy.customproxy;


import java.lang.reflect.Method;

public class CustomsProxy implements CustomInvocationHandler{

    private IPerson target;

    public IPerson getInstance(IPerson target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) CustomProxy.newProxyInstance(new CustomClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }


}
