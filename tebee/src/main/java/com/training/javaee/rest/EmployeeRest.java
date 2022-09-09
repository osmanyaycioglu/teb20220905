package com.training.javaee.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.javaee.employee.services.EmployeeManager;

@RequestScoped
@Path("/v1/employee/provision")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeRest {

    @EJB
    private EmployeeManager employeeManager;

    @Path("/add")
    @POST
    @Transactional
    public EmployeeAddResponse addEmployee(@Valid final Employee employeeParam) {
        //        if ((employeeParam.getName() == null)
        //            || employeeParam.getName()
        //                            .isEmpty()) {
        //            throw new IllegalArgumentException("Name boş olamaz");
        //        }
        this.employeeManager.add(employeeParam);
        System.out.println(employeeParam);
        EmployeeAddResponse addResponseLoc = new EmployeeAddResponse();
        addResponseLoc.setDesc("Employee eklendi.");
        addResponseLoc.setEmployeeId(1000L);
        return addResponseLoc;
    }


    @Path("/add2")
    @POST
    public Response addEmployee2(final Employee employeeParam) {
        System.out.println(employeeParam);
        EmployeeAddResponse addResponseLoc = new EmployeeAddResponse();
        addResponseLoc.setDesc("Employee eklendi.");
        addResponseLoc.setEmployeeId(1000L);
        return Response.status(205)
                       .entity(addResponseLoc)
                       .header("Content-Type",
                               "application/json")
                       .build();
    }

}
