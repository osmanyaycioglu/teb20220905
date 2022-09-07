package com.training.java.generics;


public class GenericHolder<A> {

    private A value;


    public A getValue() {
        return this.value;
    }

    public void setValue(final A valueParam) {
        this.value = valueParam;
    }

}
