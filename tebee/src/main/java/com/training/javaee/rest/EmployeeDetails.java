package com.training.javaee.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {

    @Id
    @GeneratedValue
    private Long   edId;
    private String gender;
    private String note;

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String genderParam) {
        this.gender = genderParam;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(final String noteParam) {
        this.note = noteParam;
    }

    public Long getEdId() {
        return this.edId;
    }

    public void setEdId(final Long edIdParam) {
        this.edId = edIdParam;
    }


}
