package com.training.javaee.rest.error;


public class ErrorObj {

    private String  errorDesc;
    private Integer errorCause;

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public void setErrorDesc(final String errorDescParam) {
        this.errorDesc = errorDescParam;
    }

    public Integer getErrorCause() {
        return this.errorCause;
    }

    public void setErrorCause(final Integer errorCauseParam) {
        this.errorCause = errorCauseParam;
    }


}
