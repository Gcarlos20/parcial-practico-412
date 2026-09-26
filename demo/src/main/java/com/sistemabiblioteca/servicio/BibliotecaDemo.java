package com.sistemabiblioteca.servicio;

import com.model.Libro;
import com.model.LibroTextoUNIAC;
import com.model.Novela;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaDemo {
    private BibliotecaDemo() {
    }

    public static void ejecutar() {
        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 8, 2);
        libros.add(libro1);

        try (Scanner scanner = new Scanner(System.in)) {
            Libro libro2 = new Libro();
            System.out.println("--- DATOS DE libro2 ---");
            libro2.setTitulo(leerTexto(scanner, "Título: "));
            libro2.setAutor(leerTexto(scanner, "Autor: "));
            libro2.setNumeroEjemplares(leerEnteroNoNegativo(scanner, "Número de ejemplares: "));
            int prestados;
            do {
                prestados = leerEnteroNoNegativo(scanner, "Número de ejemplares prestados: ");
                if (prestados > libro2.getNumeroEjemplares()) {
                    System.out.println("Los prestados no pueden superar los ejemplares totales.");
                }
            } while (prestados > libro2.getNumeroEjemplares());
            libro2.setNumeroEjemplaresPrestados(prestados);
            libros.add(libro2);

            libros.add(new LibroTextoUNIAC(
                    "Matemáticas básicas", "María Pérez", 5, 1, "Primer semestre", "Ingeniería"));
            libros.add(new Novela(
                    "Cien años de soledad", "Gabriel García Márquez", 3, 0, "Realista"));

            boolean ejecutando = true;
            while (ejecutando) {
                System.out.println("\n--- SISTEMA DE BIBLIOTECA ---");
                System.out.println("1. Agregar libro");
                System.out.println("2. Mostrar libros");
                System.out.println("0. Salir");
                System.out.print("Selecciona una opción: ");

                String opcion = scanner.nextLine().trim();
                switch (opcion) {
                    case "1" -> agregarLibro(scanner, libros);
                    case "2" -> mostrarLibros(libros);
                    case "0" -> ejecutando = false;
                    default -> System.out.println("Opción no válida.");
                }
            }
        }
        System.out.println("Sistema cerrado.");
    }

    private static void agregarLibro(Scanner scanner, List<Libro> libros) {
        System.out.println("\n--- AGREGAR LIBRO ---");
        String titulo = leerTexto(scanner, "Título: ");
        String autor = leerTexto(scanner, "Autor: ");
        int ejemplares = leerEnteroNoNegativo(scanner, "Número de ejemplares: ");

        libros.add(new Libro(titulo, autor, ejemplares, 0));
        System.out.println("Libro agregado al sistema.");
    }

    private static String leerTexto(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("El dato no puede quedar vacío.");
        }
    }

    private static int leerEnteroNoNegativo(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor >= 0) {
                    return valor;
                }
            } catch (NumberFormatException ignored) {
            }
            System.out.println("Ingresa un número entero igual o mayor que cero.");
        }
    }

    private static void mostrarLibros(List<Libro> libros) {
        System.out.println("\n--- LIBROS REGISTRADOS ---");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i));
        }
    }
}