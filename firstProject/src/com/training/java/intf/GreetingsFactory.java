package com.training.java.intf;


public class GreetingsFactory {

    public static final int GREETING_ENGLISH_INDEX  = 1;
    public static final int GREETING_TURKISH_INDEX  = 2;
    public static final int GREETING_SPANISH_INDEX  = 3;
    public static final int GREETING_JAPANESE_INDEX = 4;

    public static IGreetings createGreetings(final int index) {
        IGreetings greetingsLoc = null;
        switch (index) {
            case GREETING_ENGLISH_INDEX:
                greetingsLoc = new GreetEng();
                break;
            case GREETING_TURKISH_INDEX:
                greetingsLoc = new GreetTr();
                break;
            case GREETING_SPANISH_INDEX:
                greetingsLoc = new GreetSp();
                break;
            case GREETING_JAPANESE_INDEX:
                greetingsLoc = new GreetJp();
                break;

            default:
                greetingsLoc = new GreetEng();
                break;
        }
        return greetingsLoc;
    }

    public static void writeMenu() {
        System.out.println(GreetingsFactory.GREETING_ENGLISH_INDEX + "-English");
        System.out.println(GreetingsFactory.GREETING_TURKISH_INDEX + "-Turkish");
        System.out.println(GreetingsFactory.GREETING_SPANISH_INDEX + "-Spanish");
        System.out.println(GreetingsFactory.GREETING_JAPANESE_INDEX + "-Japanese");
    }
}
