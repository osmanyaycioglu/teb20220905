package com.training.javaee.rest.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GeneralErrorMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(final Exception exceptionParam) {
        ErrorObj errorObjLoc = new ErrorObj();
        errorObjLoc.setErrorDesc(exceptionParam.getMessage());
        if (exceptionParam instanceof NullPointerException) {
            errorObjLoc.setErrorCause(5555);
            return Response.status(Status.CONFLICT)
                           .entity(errorObjLoc)
                           .header("Content-Type",
                                   "application/json")
                           .build();
        }
        errorObjLoc.setErrorCause(5000);
        return Response.status(500)
                       .entity(errorObjLoc)
                       .header("Content-Type",
                               "application/json")
                       .build();
    }


}
