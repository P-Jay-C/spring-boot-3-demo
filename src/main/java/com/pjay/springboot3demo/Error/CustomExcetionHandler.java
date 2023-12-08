package com.pjay.springboot3demo.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExcetionHandler {
    

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onRuntimeException(RuntimeException ex){
        ProblemDetail detail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST,ex.getMessage());
        return detail;
    }
}
