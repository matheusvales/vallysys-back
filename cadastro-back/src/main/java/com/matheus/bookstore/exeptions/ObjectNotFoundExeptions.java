package com.matheus.bookstore.exeptions;

public class ObjectNotFoundExeptions extends RuntimeException {

     private static final long serialVersionUID =1L;

    public ObjectNotFoundExeptions(String message) {
        super(message);
    }

    public ObjectNotFoundExeptions(String message, Throwable cause) {
        super(message, cause);
    }
}
