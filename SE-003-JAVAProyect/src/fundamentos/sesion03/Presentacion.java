package fundamentos.sesion03;

import fundamentos.sesion04.clases.Empleado;
import fundamentos.sesion04.clases.Monitor;

public class Presentacion 
{
    public static void main(String[]args) 
    {   ///Constantes
        final String TITULO="PRESENNTACION DE LA SESION";
        final float TASA_INTERESES=0.05f;
        
        ///primitivos
        // Numericos enteros --->python int
        byte valor1, valor2, edad=127;
        short anio;
        int numeroCodigo=2356, secuencia;
        long serial= 14569874;

        // Numericos reales ---->python float
        float interes =0.15f;
        double monto=526.93;

        // booleano ---->python bool
        boolean estaEncencido=true;

        // caracter 
        char letra='A';

         /// Referenciados ---> String Byte Short Integer long--->float double---Boolean-charcater
        String nombre="Carlos Paredes Insua"; // python str
        double saldo =1852.45;
        //Double objetoMonto= Double.valueOf(monto);


        //Todo crea variables de tipos personalizados
        Monitor m1;
        Monitor m2;
        Empleado e1; 

        //================= Presentación de los tipos de datos ===========================//
        System.out.print("Presentación de tipos de datos \n\n");
        System.out.println("Númericos");
        System.out.printf("byte:%d \t short:%d \t int: %d\t long:%d\n", edad, anio, numeroCodigo, serial);
    }
   

}