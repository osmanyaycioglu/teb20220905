package com.training.java.intf;

import java.util.Scanner;

public class GreetingsWithoutOO {

    public static void main(final String[] args) {
        Scanner scannerLoc = null;
        try {
            scannerLoc = new Scanner(System.in);
            System.out.println("1-English");
            System.out.println("2-Turkish");
            System.out.println("3-Spanish");
            System.out.println("Seçiminiz : ");
            int index = scannerLoc.nextInt();
            System.out.println("İsim girin : ");
            String name = scannerLoc.next();
            switch (index) {
                case 1:
                    System.out.println("Hello " + name);
                    System.out.println("Goodbye " + name);
                    break;
                case 2:
                    System.out.println("Merhaba " + name);
                    System.out.println("Güle güle " + name);
                    break;
                case 3:
                    System.out.println("Ola " + name);
                    System.out.println("Adios " + name);
                    break;

                default:
                    System.out.println("Hello " + name);
                    System.out.println("Goodbye " + name);
                    break;
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            if (scannerLoc != null) {
                scannerLoc.close();
            }
        }

    }
}
