package com.study.java.pattern.adapter.demo;

public class PassportService {


    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public Result regist(String username,String password){
        return  new Result(200,"注册成功",new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public Result login(String username,String password){
        return null;
    }
}

