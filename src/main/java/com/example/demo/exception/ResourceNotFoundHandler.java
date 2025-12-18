package com.example.demo.exception;

public class ResourceNotFoundHandler extends RuntimeException{

    public ResourceNotFoundHandler (String message){
        super(message);
    }
    
}