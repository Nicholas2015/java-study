package com.study.java.pattern.adapter.general.objectadapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output() {
        int ac220V = ac220.outputAC220V();
        int adapterOutput = ac220V / 44;
        System.out.println("使用适配器输入AC" + ac220V + "V，转成电压为" + adapterOutput + "V");
        return adapterOutput;
    }
}
