package ug.practica.prueba;

import java.time.LocalDate;
import java.util.Scanner;

import ug.practica.dominio.Agencia;
import ug.practica.dominio.Caso;
import ug.practica.dominio.Detective;

public class TestAgenciaDetective {
    public static void main(String[] args) {
        
       Agencia agency= new Agencia("EL MISTERIO");
       agency.agregarCaso(2565,"Nube Blanca", "Sospecha de falsificacion de una firma en un cheque", LocalDate.now(), "Abierto");
       agency.agregarCaso(2566, "Pantera Negra", "Homicidio", LocalDate.now(), "Abierto");
       agency.agregarCaso(2567, "Hulk Breaker", "Presunto lavado de dolares", LocalDate.of(2015, 03, 13), "Cerrado");
       
       Detective detective= new Detective(666, "0943883991", "Sr. Axel", "Smith", "Storm", "0969956028", "Mapasingue Este", LocalDate.of(2010, 07, 14));
       
        Scanner Caso=new Scanner(System.in);
		System.out.print("Ingrese numero del caso:");
		int codigo = Caso.nextInt();
        Caso result = agency.buscarPorNumeroCaso(codigo);

       System.out.println("█████████████████████████████████████████████████████████████████");  
       agency.presentarName();
       System.out.println("█████████████████████████████████████████████████████████████████ \n");  
       detective.presentarDatos();
        
       System.out.println("-----------------------> █ CASO ASIGNADO █ <---------------------");
        if(result!=null) {
            System.out.printf("Caso: %s \t\t\t Alias: %s \n", result.getNumeroCaso() ,result.getAlias());
            System.out.printf("Descripcion: %s\n", result.getDescripcionCaso());
            System.out.printf("Fecha Apertura: %s \t\t\t Estado: %s\n", result.getFechaApertura(),result.getEstadoApertura());
        }else {
           System.out.println("El caso con el numero"+ codigo + "no se encuentra en nuestra base de datos");
        }
        System.out.println("████████████████████████████████████████████████████████████████");  
     
       
    }
       
}
