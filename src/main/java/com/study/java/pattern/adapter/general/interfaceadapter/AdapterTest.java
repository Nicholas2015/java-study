package com.study.java.pattern.adapter.general.interfaceadapter;

public class AdapterTest {

    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
