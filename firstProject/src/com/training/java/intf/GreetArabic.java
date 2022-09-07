package com.training.java.intf;


public class GreetArabic implements IGreetings {

    @Override
    public String sayHello(final String nameParam) {
        return "Selam " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Bye bye " + nameParam;
    }

    @Override
    public String desc() {
        return "Arabic";
    }

    @Override
    public void otherMetgod(final String strParam) {
        // TODO Auto-generated method stub

    }

}
