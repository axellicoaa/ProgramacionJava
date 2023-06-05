package ug.practica.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private List<Caso> listaCasos;
    public Agencia(String nombre) {
        listaCasos= new ArrayList<Caso>();
        this.nombre = nombre;
    }
    public void  agregarCaso(int numeroCaso, String alias, String descripcionCaso, LocalDate fechaApertura, String estadoApertura){
        Caso cas= new Caso(numeroCaso, alias, descripcionCaso, fechaApertura, estadoApertura);
        listaCasos.add(cas);
    }
    
    public void presentarName()
    {
       System.out.printf("\t\t\t%s \n", nombre);   
    }
    public void AsignarCaso(Caso caso, int numeroCaso) {
		
		Caso result = this.buscarPorNumeroCaso(caso.getNumeroCaso());
		if(result == null) {
			System.out.println("Producto "+ caso.getNumeroCaso() + " no fue encontrado");
			return;
		}
    }
    public Caso buscarPorNumeroCaso(int numeroCaso) {
        for(Caso p: listaCasos) {
			if(p.getNumeroCaso() == numeroCaso)
				return p;
		}
        return null;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}