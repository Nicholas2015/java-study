package com.study.java.pattern.adapter.demo.adapterv1;

public class Test {

    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("test","123456");

        adapter.loginForQQ("1ajsai2j3213");
    }
}
