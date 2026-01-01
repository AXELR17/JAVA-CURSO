package com.devsenior.nluis.exceptions;

public class ProductoExistente extends RuntimeException  {

    public ProductoExistente(String message){
        super(message);
    }
}
