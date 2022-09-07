package com.training.java.java8;

@FunctionalInterface
public interface IHello {

    public static final String DENEME_CON_STRING  = "Osman";
    String                     DENEME_CON_STRING2 = "Osman";

    String hello(String name,
                 String surname);

    default void print(final String name,
                       final String surname) {
        System.out.println(this.hello(name,
                                      surname));
    }

    default void xyz(final String name,
                     final String surname) {
        System.out.println(this.hello(name,
                                      surname));
    }

    public static String statitTest() {
        return "test";
    }
}
