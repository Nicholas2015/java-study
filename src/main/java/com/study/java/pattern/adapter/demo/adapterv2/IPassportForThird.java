package com.study.java.pattern.adapter.demo.adapterv2;

import com.study.java.pattern.adapter.demo.Result;

public interface IPassportForThird {

    Result loginForQQ(String openId);

    Result loginForWechat(String openId);

    Result loginForToken(String token);

    Result loginForPhone(String phone,String code);
}
