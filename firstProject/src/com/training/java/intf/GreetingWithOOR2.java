package com.training.java.intf;

import java.util.Scanner;

public class GreetingWithOOR2 {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            GreetingsFactoryR3.writeMenu();
            System.out.println("Seçiminiz : ");
            int index = scannerLoc.nextInt();
            System.out.println("İsim girin : ");
            String name = scannerLoc.next();
            IGreetings greetingsLoc = GreetingsFactoryR3.createGreetings(index);
            System.out.println(greetingsLoc.sayHello(name));
            System.out.println(greetingsLoc.sayGoodbye(name));
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
