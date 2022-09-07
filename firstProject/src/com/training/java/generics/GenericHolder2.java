package com.training.java.generics;

import com.training.java.intf.IGreetings;

public class GenericHolder2<A extends IGreetings> {

    private A value;

    public GenericHolder2(final A valueParam) {
        super();
        this.value = valueParam;
    }

    public A getValue() {
        return this.value;
    }

    public void setValue(final A valueParam) {
        this.value = valueParam;
    }

    public String getString(final String name) {
        return this.value.sayHello(name) + " " + this.value.sayGoodbye(name);
    }

}
