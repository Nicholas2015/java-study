package com.study.java.pattern.adapter.demo.adapterv2;

import com.study.java.pattern.adapter.demo.Result;

public interface ILoginAdapter {

    boolean support(Object object);

    Result login(String id,Object adapter);
}
