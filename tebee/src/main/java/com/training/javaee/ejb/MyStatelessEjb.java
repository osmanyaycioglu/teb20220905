package com.training.javaee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class MyStatelessEjb {

    @PersistenceContext(unitName = "tebee")
    private EntityManager entityManager;

    private int           counter = 0;

    public MyStatelessEjb() {
    }

    public String hello() {
        return "Hello " + this.counter++;
    }

    public String goodbye() {
        return "Goodbye " + this.counter++;
    }

}
