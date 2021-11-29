package com.study.java.pattern.adapter.demo.adapterv1;

import com.study.java.pattern.adapter.demo.PassportService;
import com.study.java.pattern.adapter.demo.Result;

public class PassportForThirdAdapter extends PassportService implements IPassportForThird{
    @Override
    public Result loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public Result loginForWechat(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public Result loginForToken(String token) {
        return loginForRegist(token,null);
    }

    @Override
    public Result loginForPhone(String phone, String code) {
        return loginForRegist(phone,null);
    }

    private Result loginForRegist(String username,String password){
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
