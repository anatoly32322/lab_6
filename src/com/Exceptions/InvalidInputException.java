package com.Exceptions;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(){
        super();
    }

    public InvalidInputException(String message){
        super(message);
    }
}