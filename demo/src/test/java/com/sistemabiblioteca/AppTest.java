package com.sistemabiblioteca;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import com.model.Libro;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void libroMuestraAutorYNumeroDePaginasConEtiquetasCorrectas()
    {
        Libro libro = new Libro("Prueba", "Ana", 120, 3, 1);
        String descripcion = libro.toString();

        assertTrue(descripcion.contains("Autor: Ana"));
        assertTrue(descripcion.contains("Páginas: 120"));
        assertFalse(descripcion.contains("Autor: 120"));
    }

    @Test
    public void prestamoActualizaEjemplaresDisponibles()
    {
        Libro libro = new Libro("Prueba", "Ana", 120, 3, 0);

        assertTrue(libro.prestamo());
        assertEquals(1, libro.getNumeroEjemplaresPrestados());
        assertEquals(2, libro.getNumeroEjemplares() - libro.getNumeroEjemplaresPrestados());
    }

    @Test
    public void constructorSolicitadoYDevolucionRespetanDisponibilidad()
    {
        Libro libro = new Libro("Prueba", "Ana", 1, 1);

        assertFalse(libro.prestamo());
        assertTrue(libro.devolucion());
        assertFalse(libro.devolucion());
    }

}
