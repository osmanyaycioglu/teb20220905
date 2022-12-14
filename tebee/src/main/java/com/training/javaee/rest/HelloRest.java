package com.training.javaee.rest;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.javaee.ejb.MySingletonEjb;
import com.training.javaee.ejb.MyStatelessEjb;


@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class HelloRest {

    @EJB
    //@Inject
    private MyStatelessEjb msejb;

    @EJB
    private MySingletonEjb mSingletonEjb;

    @Path("/hello1")
    @GET
    public String hello() {
        String helloLoc = this.msejb.hello();
        String goodbyeLoc = this.msejb.goodbye();
        return helloLoc + " " + goodbyeLoc;
    }

    @Path("/hello1")
    @POST
    public String helloa() {
        return "Hello from rest application POST";
    }

    @Path("/hello1")
    @PUT
    public String hellob() {
        return "Hello from rest application PUT";
    }

    @Path("/hello1")
    @PATCH
    public String helloc() {
        return "Hello from rest application PATCH";
    }

    @Path("/hello1")
    @DELETE
    public String hellod() {
        return "Hello from rest application DELETE";
    }

}
