package com.study.java.pattern.adapter.general.classadapter;

public class PowerAdapter extends AC220 implements DC5 {

    @Override
    public int output() {
        int ac220V = super.outputAC220V();
        int adapterOutput = ac220V / 44;
        System.out.println("使用适配器输入AC" + ac220V + "V，转成电压为" + adapterOutput + "V");
        return adapterOutput;
    }
}
