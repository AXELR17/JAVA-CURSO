package com.devsenior.nluis.excepctions;

public class ProductoExistente extends RuntimeException  {

    public ProductoExistente(String message){
        super(message);
    }
}
