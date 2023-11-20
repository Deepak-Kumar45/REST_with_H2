package com.spring.rest_with_h2.exceptions;

public class StudentNotFoundException extends RuntimeException{
    private String msg;

    public StudentNotFoundException(){}

    public StudentNotFoundException(String msg){
        super(msg);
        this.msg=msg;
    }
}
