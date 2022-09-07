package com.training.java.intf;

public class GreetingsFactoryR3 {

    private static IGreetings[] greetings = new IGreetings[] {
                                                               new GreetEng(),
                                                               new GreetTr(),
                                                               new GreetSp(),
                                                               new GreetJp(),
                                                               new GreetArabic()
    };

    public static IGreetings createGreetings(final int index) {
        if ((index - 1) > GreetingsFactoryR3.greetings.length) {
            return new GreetEng();
        }
        return GreetingsFactoryR3.greetings[index - 1];
    }

    public static void writeMenu() {
        for (int iLoc = 0; iLoc < GreetingsFactoryR3.greetings.length; iLoc++) {
            System.out.println((iLoc + 1) + "-" + GreetingsFactoryR3.greetings[iLoc].desc());
        }
    }
}
