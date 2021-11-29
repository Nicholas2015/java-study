package com.study.java.pattern.adapter.general.objectadapter;

public class AdapterTest {

    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter(new AC220());
        adapter.output();
    }
}
