package com.capgemini.inventorymanagementsystem.exception;

public class IdNotFoundOperation extends RuntimeException{
    public IdNotFoundOperation(String msg){
        super(msg);
    }

    public IdNotFoundOperation(String msg,Throwable e){
        super(msg,e);
    }
}
