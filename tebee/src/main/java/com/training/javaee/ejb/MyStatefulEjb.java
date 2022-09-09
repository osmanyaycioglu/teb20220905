package com.training.javaee.ejb;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class MyStatefulEjb implements Serializable {

    private int counter = 0;

    public String hello() {
        return "Hello " + this.counter++;
    }

    public String goodbye() {
        return "Goodbye " + this.counter++;
    }

    @PostConstruct
    public void initXyz() {
        System.out.println("Init");
    }

    @PreDestroy
    public void destroyAbc() {
        System.out.println("Destroy");
    }

    @PrePassivate
    public void beforeWrtie() {
    }

    @PostActivate
    public void afterActive() {
    }

    @Remove
    public void remove() {
    }

}
