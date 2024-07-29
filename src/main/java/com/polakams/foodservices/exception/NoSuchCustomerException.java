package com.polakams.foodservices.exception;

public class NoSuchCustomerException extends RuntimeException{

    public NoSuchCustomerException(String message) {
        super(message);
    }
}
