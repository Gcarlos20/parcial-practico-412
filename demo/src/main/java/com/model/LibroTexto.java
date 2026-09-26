package com.model;

public class LibroTexto extends Libro {

   
    private String curso;

    public LibroTexto() {
        super();
        this.curso = "";
    }

    public LibroTexto(String titulo, String autor,int numeroPagina, int numeroEjemplares, int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor,numeroPagina, numeroEjemplares, numeroEjemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso;
    }
}
    

