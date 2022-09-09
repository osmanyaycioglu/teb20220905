package com.training.javaee.ejb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
@LocalBean
public class MySingletonEjb {

    private final AtomicInteger counter = new AtomicInteger();

    private final List<String>  list    = Collections.synchronizedList(new ArrayList<>());

    @Lock(LockType.WRITE)
    public String hello() {
        return "Hello " + this.counter.incrementAndGet();
    }

    @Lock(LockType.READ)
    public String goodbye() {
        return "Goodbye " + this.counter.incrementAndGet();
    }

}
