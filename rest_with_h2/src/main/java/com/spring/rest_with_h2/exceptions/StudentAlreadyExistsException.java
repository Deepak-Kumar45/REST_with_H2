package com.spring.rest_with_h2.exceptions;

public class StudentAlreadyExistsException extends RuntimeException{

    public StudentAlreadyExistsException(){}

    public StudentAlreadyExistsException(String msg){
        super(msg);
    }
}
