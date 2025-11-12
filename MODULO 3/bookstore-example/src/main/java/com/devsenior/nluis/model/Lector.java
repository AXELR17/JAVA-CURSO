package com.devsenior.nluis.model;

import java.time.LocalDate;

public class Lector {
    private String nombre;
    private LocalDate fechamulta;
    private Prestamo[] prestamos;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechamulta() {
        return fechamulta;
    }
    public void setFechamulta(LocalDate fechamulta) {
        this.fechamulta = fechamulta;
    }
    public Prestamo[] getPrestamo() {
        return prestamos;
    }
    public void setPrestamo(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }
    
}
