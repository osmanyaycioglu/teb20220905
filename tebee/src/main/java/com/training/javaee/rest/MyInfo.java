package com.training.javaee.rest;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;

public class MyInfo {

    @QueryParam("name")
    private String name;
    @QueryParam("sur")
    private String surname;
    @HeaderParam("nid")
    private Long   nid;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Long getNid() {
        return this.nid;
    }

    public void setNid(final Long nidParam) {
        this.nid = nidParam;
    }


}
