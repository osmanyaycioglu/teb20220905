package com.training.java.intf;


public class GreetTr implements IGreetings, Comparable<String> {

    @Override
    public String sayHello(final String nameParam) {
        return "Merhaba " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Güle güle " + nameParam;
    }

    @Override
    public String desc() {
        return "Turkish";
    }

    @Override
    public void otherMetgod(final String strParam) {
        // TODO Auto-generated method stub

    }

    @Override
    public int compareTo(final String oParam) {
        // TODO Auto-generated method stub
        return 0;
    }


}
