package com.training.java.intf;


public class GreetSp implements IGreetings {

    @Override
    public String sayHello(final String nameParam) {
        return "Ola " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Adios " + nameParam;
    }

    @Override
    public String desc() {
        return "Spanish";
    }

    @Override
    public void otherMetgod(final String strParam) {
        // TODO Auto-generated method stub

    }

}
