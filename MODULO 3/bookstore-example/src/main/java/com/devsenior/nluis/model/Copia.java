package com.devsenior.nluis.model;

public class Copia {
    private Integer identificador;
    private Libro libro;
    private EstadoCopia estado;
    

    public Copia(Libro libro) {
        this(1, libro,EstadoCopia.BIBLIOTECA);
    }
    
    public Copia(Integer identificador, Libro libro, EstadoCopia estado) {
        this.identificador = 1;
        this.libro = libro;
        this.estado = estado;
    }

    public Integer getIdentificador() {
        return identificador;
    }
    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }
    public Libro getLibro() {
        return libro;
    }
    public EstadoCopia getEstado() {
        return estado;
    }
    public void setEstado(EstadoCopia estado) {
        this.estado = estado;
    }
}
