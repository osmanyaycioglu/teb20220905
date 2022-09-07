package com.training.java.intf;


public interface IGreetings extends IDescription, IOther {

    String sayHello(String name);

    String sayGoodbye(String name);

}
