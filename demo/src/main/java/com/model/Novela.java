package com.model;

public class Novela extends Libro {
    private String tipo;

    public Novela() {
        super();
        this.tipo = "";
    }

    public Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.tipo = tipo;
    }

    public Novela(String titulo, String autor, int numeroPagina, int numeroEjemplares, int numeroEjemplaresPrestados, String tipo) {
        super(titulo, autor, numeroPagina, numeroEjemplares, numeroEjemplaresPrestados);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }
}