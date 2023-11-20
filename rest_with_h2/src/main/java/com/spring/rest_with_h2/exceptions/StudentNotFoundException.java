package com.spring.rest_with_h2.exceptions;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(){}

    public StudentNotFoundException(String msg){
        super(msg);
    }
}
