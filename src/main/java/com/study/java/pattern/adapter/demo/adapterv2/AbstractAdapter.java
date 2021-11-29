package com.study.java.pattern.adapter.demo.adapterv2;

import com.study.java.pattern.adapter.demo.PassportService;
import com.study.java.pattern.adapter.demo.Result;

public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {


    protected Result loginForRegist(String username, String password){
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
