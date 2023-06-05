package ug.practicas.pruebas;

import ug.practicas.dominio.Autor;
import ug.practicas.dominio.Biblioteca;
import ug.practicas.dominio.Libro;

public class TestBiblioteca 
{
    public static void main(String[] args) {
        Biblioteca biblioteca= new Biblioteca(1, "BIBLIOTECA CENTRAL");

        Autor autor =new Autor(12, "Alberto Cuevas Alvarez", "Colombiano");

        Libro libroPython= new Libro(2536,"Python 3 Curso Practico",autor );
        //!Todo agregar capitulos al libro

        libroPython.agregarCapitulo(1, "Introduccion", 48);
        libroPython.agregarCapitulo(2, "Empezando a programar", 64);
        libroPython.agregarCapitulo(3, "Elementos fundamentales", 56);
        libroPython.agregarCapitulo(4, "Programacion Funcional", 42);

        biblioteca.agregarLibro(libroPython);
    }
    
}
