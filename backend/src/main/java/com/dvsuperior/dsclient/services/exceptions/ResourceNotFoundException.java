package com.dvsuperior.dsclient.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID =1l;

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
