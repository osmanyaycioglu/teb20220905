package com.training.java.objects;


public class IMMutableObj {

    private final String string;

    public IMMutableObj(final String stringParam) {
        super();
        this.string = stringParam;
    }

    public String getString() {
        return this.string;
    }

}
