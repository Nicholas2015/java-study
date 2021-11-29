package com.study.java.pattern.adapter.demo.adapterv2;

import com.study.java.pattern.adapter.demo.PassportService;
import com.study.java.pattern.adapter.demo.Result;

public class LoginForQQAdapter extends AbstractAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public Result login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
