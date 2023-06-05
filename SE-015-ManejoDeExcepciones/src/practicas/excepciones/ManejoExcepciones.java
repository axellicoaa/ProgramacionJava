package practicas.excepciones;

import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner ingreso= new Scanner(System.in);
        try
        {
            int a;
            int b;
            System.out.print("Ingrese operando 1: ");
            a= Integer.parseInt(ingreso.nextLine());
            System.out.print("Ingrese operando 2: ");
            b= Integer.parseInt(ingreso.nextLine());

          
            int res = a/b;

            System.out.print("Se ejecutó el print de la linea 20... \n");

        }
        catch(NumberFormatException nfe){
            System.out.print("Exception atrapada!!! Debe ingresar datos numericos..."+nfe.getMessage());
        }
        catch(ArithmeticException aer)
        {
            System.out.print("Exception atrapada!!! Divisor no debe ser cero...");

        }
        finally
        {
            System.out.print("Este bloque Finally de sentencia siempre de ejecutará...\n");
        }
    }

    

    
}
