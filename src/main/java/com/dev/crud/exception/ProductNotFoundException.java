package com.dev.crud.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super("Produto com ID (" + id + ") não localizado.");
    }
}
