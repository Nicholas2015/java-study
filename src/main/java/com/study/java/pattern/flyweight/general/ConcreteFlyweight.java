package com.study.java.pattern.flyweight.general;

/**
 *
 */
public class ConcreteFlyweight implements IFlyweight{

    private String intringsicState;

    public ConcreteFlyweight(String intringsicState) {
        this.intringsicState = intringsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address" + System.identityHashCode(this));
        System.out.println("IntringsicState " + this.intringsicState);
        System.out.println("ExtrinsicState " + extrinsicState);
    }
}
