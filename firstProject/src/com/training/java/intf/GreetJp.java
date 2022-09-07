package com.training.java.intf;


public class GreetJp implements IGreetings {

    @Override
    public String sayHello(final String nameParam) {
        return "Ha " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Ho " + nameParam;
    }

    @Override
    public String desc() {
        return "Japanese";
    }

    @Override
    public void otherMetgod(final String strParam) {
        // TODO Auto-generated method stub

    }


}
