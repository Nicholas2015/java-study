package com.study.java.pattern.composite.general.safe;

public class Compisite extends Component {


    public Compisite(String name) {
        super(name);
    }

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("Add Child not supported.");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("Add Child not supported.");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("Add Child not supported.");
    }

    @Override
    public String operation() {
        return null;
    }
}
