package com.training.javaee.ejb;


public class MyStatelessEjbProxy extends MyStatelessEjb {

    @Override
    public String hello() {
        // get real ejb instance from pool
        MyStatelessEjb ejbLoc = null;
        return ejbLoc.hello();
    }

    @Override
    public String goodbye() {
        // get real ejb instance from pool
        MyStatelessEjb ejbLoc = null;
        return ejbLoc.goodbye();
    }
}
