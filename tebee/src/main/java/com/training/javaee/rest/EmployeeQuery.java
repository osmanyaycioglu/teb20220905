package com.training.javaee.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.javaee.employee.services.EmployeeManager;

@Path("/v1/employee/query")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeQuery {

    @EJB
    private EmployeeManager employeeManager;

    @Path("/get/all")
    @GET
    public List<Employee> getAll() {
        return this.employeeManager.getAll();
    }

    @Path("/get/one")
    @GET
    public Employee getOneEmployee(@QueryParam("eid") final Long employeeId) {
        return this.employeeManager.getOne(employeeId);
    }

    @Path("/get/single")
    @GET
    public Employee getSingleEmployee(@QueryParam("empid") final Long employeeId) {
        return null;
    }

    @Path("/get/by/name")
    @GET
    public List<Employee> getByName(@QueryParam("name") final String name) {
        return this.employeeManager.getByName(name);
    }

}
