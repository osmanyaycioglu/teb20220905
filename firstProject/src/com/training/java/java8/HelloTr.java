package com.training.java.java8;


public class HelloTr implements IHello {

    private final String prefix;

    public HelloTr(final String prefixParam) {
        super();
        this.prefix = prefixParam;
    }

    @Override
    public String hello(final String nameParam,
                        final String surnameParam) {
        return this.prefix + " Hello " + nameParam + " " + surnameParam;
    }

}
