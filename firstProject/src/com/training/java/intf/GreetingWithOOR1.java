package com.training.java.intf;

import java.util.Scanner;

public class GreetingWithOOR1 {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("1-English");
            System.out.println("2-Turkish");
            System.out.println("3-Spanish");
            System.out.println("Seçiminiz : ");
            int index = scannerLoc.nextInt();
            System.out.println("İsim girin : ");
            String name = scannerLoc.next();
            IGreetings greetingsLoc = GreetingsFactory.createGreetings(index);
            System.out.println(greetingsLoc.sayHello(name));
            System.out.println(greetingsLoc.sayGoodbye(name));

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
