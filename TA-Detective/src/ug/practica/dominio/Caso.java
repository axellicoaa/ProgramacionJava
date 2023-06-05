package ug.practica.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Caso {
private int numeroCaso;
private String alias;
private String descripcionCaso;
private LocalDate fechaApertura=LocalDate.now();
private String estadoApertura;


public Caso(int numeroCaso, String alias, String descripcionCaso, LocalDate fechaApertura, String estadoApertura) {
    
    this.numeroCaso = numeroCaso;
    this.alias = alias;
    this.descripcionCaso = descripcionCaso;
    this.fechaApertura = fechaApertura;
    this.estadoApertura = estadoApertura;
   
 }
    public int getNumeroCaso() {
        return numeroCaso;
    }
    public void setNumeroCaso(int numeroCaso) {
        this.numeroCaso = numeroCaso;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getDescripcionCaso() {
        return descripcionCaso;
    }
    public void setDescripcionCaso(String descripcionCaso) {
        this.descripcionCaso = descripcionCaso;
    }
    public LocalDate getFechaApertura() {
        return fechaApertura;
    }
    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    public String getEstadoApertura() {
        return estadoApertura;
    }
    public void setEstadoApertura(String estadoApertura) {
        this.estadoApertura = estadoApertura;
    }

List<Caso> caso= new ArrayList<Caso>();


}


