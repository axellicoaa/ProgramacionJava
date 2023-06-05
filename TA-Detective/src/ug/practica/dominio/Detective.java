package ug.practica.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Detective {
    private int codigo;
    private String cedula;
    private String nombre;
    private String apellidos;
    private String alias;
    private String telefono;
    private String direccion;
    private LocalDate fechaIngreso; 
    

   public Detective(int codigo, String cedula, String nombre, String apellidos, String alias, String telefono,
   String direccion, LocalDate fechaIngreso) {
    this.codigo = codigo;
    this.cedula = cedula;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.alias = alias;
    this.telefono = telefono;
    this.direccion = direccion;
    this.fechaIngreso = fechaIngreso;
    }

     public void presentarDatos()
    {
    System.out.println("---------------------> █ DATOS DEL DETECTIVE █ <------------------");
    System.out.printf("Detective:%s \t\t\t Cédula: %s \n", codigo, cedula);
    System.out.printf("Nombre:%s \t\t Apellidos: %s \n", nombre, apellidos);
    System.out.printf("Alias: %s \t\t\t Telefono: %s \n", alias, telefono);
    System.out.println("Direccion:"+direccion); 
    System.out.println("Fecha de Ingreso:"+ fechaIngreso);
    }


   
    }