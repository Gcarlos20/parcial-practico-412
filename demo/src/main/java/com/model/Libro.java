package com.model;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPagina;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    // Constructor 
    public Libro()
    {
        this.titulo = "";
        this.autor = "";
        this.numeroPagina = 0;
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0 ;

    }

    // contructor con parameetros

   public Libro(String titulo, String autor,int numeroPagina, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // Getters Y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumeroPagina() { return numeroPagina; }
    public void setNumeroPagina(int numeroPagina) { this.numeroPagina = numeroPagina; }


    public int getNumeroEjemplares() { return numeroEjemplares; }
    public void setNumeroEjemplares(int numeroEjemplares) { this.numeroEjemplares = numeroEjemplares; }

    public int getNumeroEjemplaresPrestados() { return numeroEjemplaresPrestados; }
    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) { this.numeroEjemplaresPrestados = numeroEjemplaresPrestados; }

    // Método préstamo
    public boolean prestamo() {
        int disponibles = numeroEjemplares - numeroEjemplaresPrestados;
        if (disponibles > 0) {
            numeroEjemplaresPrestados++;
            return true;
        }
        System.out.println("\nLibro prestado Elige Otro......");
        return false;
    }

    // Metodo devolucion
    
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        System.out.println("\nLibro Devuelto");
        return false;
    }



    @Override
    public String toString() {
        return "Título: " + titulo + 
               ", Autor: " + autor + 
                ", Autor: " + numeroPagina + 
               ", Ejemplares Totales: " + numeroEjemplares + 
               ", Prestados: " + numeroEjemplaresPrestados + 
               ", Disponibles: " + (numeroEjemplares - numeroEjemplaresPrestados);
    }



}

    

