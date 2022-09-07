package com.training.java.intf;

import java.util.Scanner;

public class GreetingWithOO {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("1-English");
            System.out.println("2-Turkish");
            System.out.println("3-Spanish");
            System.out.println("Seçiminiz : ");
            int index = scannerLoc.nextInt();
            System.out.println("İsim girin : ");
            String name = scannerLoc.next();
            IGreetings greetingsLoc = null;
            switch (index) {
                case 1:
                    greetingsLoc = new GreetEng();
                    break;
                case 2:
                    greetingsLoc = new GreetTr();
                    break;
                case 3:
                    greetingsLoc = new GreetSp();
                    break;

                default:
                    greetingsLoc = new GreetEng();
                    break;
            }
            System.out.println(greetingsLoc.sayHello(name));
            System.out.println(greetingsLoc.sayGoodbye(name));

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
