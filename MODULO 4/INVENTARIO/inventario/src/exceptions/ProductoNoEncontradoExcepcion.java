package com.devsenior.nluis.excepctions;

public class ProductoNoEncontradoExcepcion extends RuntimeException {
 public ProductoNoEncontradoExcepcion(String message){
    super(message);
 }
}