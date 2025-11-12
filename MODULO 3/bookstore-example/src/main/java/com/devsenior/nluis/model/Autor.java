package com.devsenior.nluis.model;

import java.time.LocalDate;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private Libro[] libros;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Libro[] getLibros() {
        return libros;
    }
    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
    
}
