package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

import java.util.Map;
import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(MethodArgumentNotValidHandler.class) //runtime expection
        public ResponseEntity<String> handleNotFound(MethodArgumentNotValidHandler ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }

    @ExceptionHandler(MethodArgumentNotValidHandler.class)
    public ResponseEntity<Map<String,String>> handleMethod(MethodArgumentNotValidHandler mex){
        
        Map<String,String> errors=new HashMap<>();

        mex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}