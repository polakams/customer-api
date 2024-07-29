package com.polakams.foodservices.advice;

import com.polakams.foodservices.exception.NoSuchCustomerException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationHandlerException {

    @ExceptionHandler(NoSuchCustomerException.class)
    public ResponseEntity<String> handleUserNotFoundException(NoSuchCustomerException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("abc test error");
    }

}
