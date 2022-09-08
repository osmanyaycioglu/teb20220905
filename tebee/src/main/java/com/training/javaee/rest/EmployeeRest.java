package com.training.javaee.rest;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/employee/provision")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeRest {

    @Path("/add")
    @POST
    public EmployeeAddResponse addEmployee(@Valid final Employee employeeParam) {
        //        if ((employeeParam.getName() == null)
        //            || employeeParam.getName()
        //                            .isEmpty()) {
        //            throw new IllegalArgumentException("Name boş olamaz");
        //        }
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
