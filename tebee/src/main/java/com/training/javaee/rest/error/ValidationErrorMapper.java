package com.training.javaee.rest.error;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationErrorMapper implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(final ConstraintViolationException cve) {
        ErrorObj errorObjLoc = new ErrorObj();
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Validasyon problemi : ");
        Set<ConstraintViolation<?>> constraintViolationsLoc = cve.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolationLoc : constraintViolationsLoc) {
            builderLoc.append(" -- ");
            builderLoc.append(constraintViolationLoc);
        }
        errorObjLoc.setErrorDesc(builderLoc.toString());
        errorObjLoc.setErrorCause(4001);
        return Response.status(Status.BAD_REQUEST)
                       .entity(errorObjLoc)
                       .header("Content-Type",
                               "application/json")
                       .build();
    }

}
