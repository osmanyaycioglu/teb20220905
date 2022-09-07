package com.training.java.intf;


public class GreetEng implements IGreetings {

    @Override
    public String sayHello(final String nameParam) {
        return "Hello " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Goodbye " + nameParam;
    }

    @Override
    public String desc() {
        return "English";
    }

    @Override
    public void otherMetgod(final String strParam) {
        // TODO Auto-generated method stub

    }

}
