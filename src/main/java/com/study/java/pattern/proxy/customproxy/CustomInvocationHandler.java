package com.study.java.pattern.proxy.customproxy;

import java.lang.reflect.Method;

public interface CustomInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
