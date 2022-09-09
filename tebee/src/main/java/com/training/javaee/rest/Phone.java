package com.training.javaee.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private Long   phoneId;
    private String name;
    private String number;

    public Long getPhoneId() {
        return this.phoneId;
    }

    public void setPhoneId(final Long phoneIdParam) {
        this.phoneId = phoneIdParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }


}
