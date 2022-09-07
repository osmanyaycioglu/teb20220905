package com.training.java.intf;


public class GreetRun {

    public static void main(final String[] args) {
        IGreetings greetEngLoc = new GreetTr();
        // Code değişikliklerinden etkilenmez
        System.out.println(greetEngLoc.sayHello("osman"));
        System.out.println(greetEngLoc.sayGoodbye("osman"));

    }
}
