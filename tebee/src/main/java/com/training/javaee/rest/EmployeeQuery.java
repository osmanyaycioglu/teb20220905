package com.training.javaee.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/v1/employee/query")
public class EmployeeQuery {

    @Path("/get/all")
    @GET
    public List<Employee> getAll() {
        return null;
    }

    @Path("/get/one")
    @GET
    public Employee getOneEmployee(@QueryParam("eid") final Long employeeId) {
        return null;
    }

    @Path("/get/single")
    @GET
    public Employee getSingleEmployee(@QueryParam("empid") final Long employeeId) {
        return null;
    }

}
