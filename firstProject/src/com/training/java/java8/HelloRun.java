package com.training.java.java8;


public class HelloRun {

    public static void main(final String[] args) {
        String prefix = "XYZ";
        IHello helloLoc = new HelloTr("XYZ");
        System.out.println(helloLoc.hello("Osman",
                                          "Yaycıoğlu"));

        IHello hello2Loc = new IHello() {

            @Override
            public String hello(final String nameParam,
                                final String surnameParam) {
                return prefix + " Hello " + nameParam + " " + surnameParam;
            }
        };
        System.out.println(hello2Loc.hello("Osman",
                                           "Yaycıoğlu"));
        IHello hello3Loc = new IHello() {

            @Override
            public String hello(final String nameParam,
                                final String surnameParam) {
                return prefix + " Hello " + nameParam + " " + surnameParam;
            }
        };
        greet(hello3Loc);
        System.out.println(hello3Loc.hello("Osman",
                                           "Yaycıoğlu"));
        IHello hello4Loc = (a,
                            b) -> prefix + " Hello " + a + " " + b;
        System.out.println(hello4Loc.hello("Osman",
                                           "Yaycıoğlu"));
        greet((x,
               y) -> prefix + " Selam " + x + " " + y);
    }

    public static void greet(final IHello helloParam) {
        System.out.println(helloParam.hello("osman",
                                            "yay"));
    }
}
