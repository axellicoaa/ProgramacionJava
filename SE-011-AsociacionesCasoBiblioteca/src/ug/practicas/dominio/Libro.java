package ug.practicas.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libro 
{
    private int codigo;
    private String isbn;
    private String nombre;
    private LocalDate fechaPublicacion;
    private int totalCapitulos;
    private int totalPaginas;
    
    //!Asociacion simple con autor
    private Autor autor;
    //!Asociacion composicion --> con capitulo
    private List<Capitulo> listaCapitulos;
   
    //?Constructor  de entidad libro
    public Libro(int codigo, String nombre, Autor autor) {

        listaCapitulos = new ArrayList<Capitulo>();

        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
    }
    public void agregarCapitulo(int numero, String nombre, int totalPaginas){
        Capitulo capitulo = new Capitulo(numero, nombre, totalPaginas);
        
        listaCapitulos.add(capitulo);
    }
    
}
