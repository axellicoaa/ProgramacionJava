package ug.practicas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int codigo;
    private String nombre;

    //! Asociacion de tipo agregacion
    private List<Libro> listaLibros;

    public Biblioteca(int codigo, String nombre) {

        listaLibros=new ArrayList<Libro>();
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }
    
    
}
