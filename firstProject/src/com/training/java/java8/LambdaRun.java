package com.training.java.java8;


public class LambdaRun {

    public static void main(final String[] args) {
        IHello helloLoc = (name,
                           sur) -> "Selam " + name + "-" + sur;

        IHello helloLoc2 = (name,
                            sur) -> {
            System.out.println("Returning greeet");
            return "Selam " + name + "-" + sur;
        };

        IGoodbye goodbyeLoc = j -> "Bye bye " + j;

        ITalk talkLoc = () -> "Konuşuyorum";

        IHello helloLoc3 = (d,
                            r) -> xyz(d,
                                      r);
        IHello helloLoc4 = LambdaRun::xyz;

        LambdaRun lambdaRun = new LambdaRun();
        IHello helloLoc5 = lambdaRun::ndf;
    }

    public static String xyz(final String o,
                             final String y) {
        return "Static Test " + o + " " + y;
    }

    public String ndf(final String o,
                      final String y) {
        return "Object Test " + o + " " + y;

    }

}
