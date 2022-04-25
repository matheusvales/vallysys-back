package com.matheus.bookstore.resources.exeptions;


import com.matheus.bookstore.exeptions.ObjectNotFoundExeptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletRequest;

@ControllerAdvice
public class ResouceExceptionHendler {

    @ExceptionHandler(ObjectNotFoundExeptions.class)
    public ResponseEntity<StandarErros> objectNotFoudExeption(ObjectNotFoundExeptions e, ServletRequest request){
        StandarErros error =new StandarErros(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);

    }
}
