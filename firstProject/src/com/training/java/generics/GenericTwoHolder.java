package com.training.java.generics;


public class GenericTwoHolder<A, F> {

    private A value;
    private F secondvalue;


    public A getValue() {
        return this.value;
    }

    public void setValue(final A valueParam) {
        this.value = valueParam;
    }


    public F getSecondvalue() {
        return this.secondvalue;
    }


    public void setSecondvalue(final F secondvalueParam) {
        this.secondvalue = secondvalueParam;
    }


}
