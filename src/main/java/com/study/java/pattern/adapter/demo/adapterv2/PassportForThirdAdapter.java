package com.study.java.pattern.adapter.demo.adapterv2;

import com.study.java.pattern.adapter.demo.PassportService;
import com.study.java.pattern.adapter.demo.Result;

import java.lang.reflect.InvocationTargetException;

public class PassportForThirdAdapter implements IPassportForThird {
    @Override
    public Result loginForQQ(String openId) {
        return processLogin(openId,LoginForQQAdapter.class);
    }

    @Override
    public Result loginForWechat(String openId) {
        return processLogin(openId,LoginForQQAdapter.class);
    }

    @Override
    public Result loginForToken(String token) {
        return processLogin(token,LoginForQQAdapter.class);
    }

    @Override
    public Result loginForPhone(String phone, String code) {
        return processLogin(phone,LoginForQQAdapter.class);
    }

    private Result processLogin(String id,Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.getConstructor().newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id,adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }


}
