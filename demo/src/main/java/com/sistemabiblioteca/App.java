package com.sistemabiblioteca;

import com.model.Novela;
import com.sistemabiblioteca.servicio.BibliotecaDemo;

public class App 
{
    public static void main(String[] args) {
        Novela novela = new Novela("La isla del tesoro", "Robert Louis Stevenson", 1, 0, "Aventuras");
        System.out.println("--- PRUEBAS DE PRÉSTAMO Y DEVOLUCIÓN ---");
        System.out.println(novela);
        System.out.println("Préstamo con ejemplar disponible: " + novela.prestamo());
        System.out.println("Préstamo sin ejemplares disponibles: " + novela.prestamo());
        System.out.println("Devolución con préstamo pendiente: " + novela.devolucion());
        System.out.println("Devolución sin préstamo pendiente: " + novela.devolucion());
        System.out.println(novela);

        BibliotecaDemo.ejecutar();
    }
}

