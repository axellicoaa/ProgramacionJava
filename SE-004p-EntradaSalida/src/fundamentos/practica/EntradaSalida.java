package fundamentos.practica;

import java.util.Scanner;

public class EntradaSalida 
{
    //!Declaracion de constantes 
    static final String COMPANIA= "SU LLANTA CIA";
    static final float DESCUENTO_VENTA= 0.07f;
    static final String PROCESO= "VENTA";
    static final String LINEA = "██████████████████████████████████████████████████████████████████";
    static Scanner ingreso; 

    public static void main(String[] args) 
    {
        ingreso = new Scanner (System.in);
        //!Declarar las variables de ingreso
        String nombres;
        String cedula;
        int cantidad;
        float precio;
        //todo variables de trabajo
        double subtotal=0; 
        double ValorDescuento=0;
        double valorPagar=0;
        
        //todo mostrar por teclado (entrada de datos)
        System.out.print("Ingresar cédula: ");
        cedula= ingreso.nextLine();

        System.out.print("Ingresar nombres: ");
        nombres= ingreso.nextLine();
        
        System.out.print("Ingresar cantidad: ");
        cantidad= Integer.parseInt(ingreso.nextLine());

        System.out.print("Ingresar precio: ");
        precio = Float.parseFloat(ingreso.nextLine());

        



        //todo mostrar por consola 
        System.out.println(LINEA);
        System.out.printf("%34s \n", COMPANIA);
        
        System.out.printf("%30s \n",PROCESO);
        System.out.println(LINEA);
        System.out.println("Cedula: "+ cedula);
        System.out.printf("Nommbres:  %s \n", nombres);
        System.out.println(LINEA);

        System.out.printf("Cantidad: %d \n", cantidad);
        System.out.printf("Precio: %2f \t          Subtotal: %2f \n",precio, subtotal);
        System.out.printf("Valor Descuento: %2f \t  Descuento: %2f \n", ValorDescuento, DESCUENTO_VENTA);
        System.out.printf("Valor a Pagar: %2f \n", valorPagar);
        System.out.println(LINEA);



        
    }
}
