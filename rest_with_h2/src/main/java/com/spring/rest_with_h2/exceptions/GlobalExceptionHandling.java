package com.spring.rest_with_h2.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.spring.rest_with_h2.entity.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandling {
    
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlingStdNotFoundException(StudentNotFoundException ex,WebRequest request){
        ErrorResponse response=new ErrorResponse(ex.getMessage(), new Date(), request.getDescription(false));
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StudentAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handlingStdAlreadyExistsException(StudentAlreadyExistsException ex,WebRequest req){
        ErrorResponse resp=new ErrorResponse(ex.getMessage(), new Date(), req.getDescription(false));
        return new ResponseEntity<ErrorResponse>(resp, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handlingGenericException(Exception ex,WebRequest req){
        ErrorResponse resp=new ErrorResponse(ex.getMessage(),new Date(),req.getDescription(false));
        return new ResponseEntity<ErrorResponse>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
