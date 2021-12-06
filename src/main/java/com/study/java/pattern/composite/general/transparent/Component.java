package com.study.java.pattern.composite.general.transparent;

/**
 * 抽象根节点
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("Add Child not supported.");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("Add Child not supported.");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("Add Child not supported.");
    }
}
