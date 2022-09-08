package com.training.javaee.rest;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/greet")
public class GreetingsRest {

    @Path("/greet1/{xyz}")
    @GET
    public String greet1(@PathParam("xyz") final String name) {
        return "Greetings " + name;
    }

    @Path("/greet2/{xyz}/{abc}")
    @GET
    public String greet2(@PathParam("xyz") final String name,
                         @PathParam("abc") final String surname) {
        return "Greetings " + name + " " + surname;
    }

    @Path("/greet3/{xyz}/{abc}/id/{mnb}")
    @GET
    public String greet3(@PathParam("xyz") final String name,
                         @PathParam("abc") final String surname,
                         @PathParam("mnb") final Long nId) {
        return "Greetings " + name + " " + surname + " " + nId;
    }

    // /tebee/rest/greet/greet4?xyz=osman
    @Path("/greet4")
    @GET
    public String greet4(@QueryParam("xyz") final String name) {
        return "Greetings 4 " + name;
    }

    // /tebee/rest/greet/greet5?xyz=osman&abc=yay
    @Path("/greet5")
    @GET
    public String greet5(@QueryParam("xyz") final String name,
                         @QueryParam("abc") final String surname) {
        return "Greetings 5 " + name + " " + surname;
    }

    // /tebee/rest/greet/greet6/100?xyz=osman&abc=yay
    @Path("/greet6/{nid}")
    @GET
    public String greet6(@QueryParam("xyz") final String name,
                         @QueryParam("abc") final String surname,
                         @PathParam("nid") final Long nid) {
        return "Greetings 6 " + name + " " + surname + "  " + nid;
    }

    @Path("/greet7")
    @POST
    public String greet7(@FormParam("xyz") final String name,
                         @FormParam("abc") final String surname,
                         @FormParam("nid") final Long nid) {
        return "Greetings 7 " + name + " " + surname + "  " + nid;
    }

    @Path("/greet8")
    @POST
    public String greet8(@HeaderParam("xyz") final String name,
                         @HeaderParam("abc") final String surname,
                         @HeaderParam("nid") final Long nid) {
        return "Greetings 8 " + name + " " + surname + "  " + nid;
    }

    @Path("/greet9")
    @POST
    public String greet9(@BeanParam final MyInfo infoParam) {
        return "Greetings 8 " + infoParam.getName() + " " + infoParam.getSurname() + "  " + infoParam.getNid();
    }

    @Path("/greet10")
    @POST
    public String greet10(@MatrixParam("xyz") final String name,
                          @MatrixParam("abc") final String surname,
                          @MatrixParam("nid") final Long nid) {
        return "Greetings 8 " + name + " " + surname + "  " + nid;
    }

}
