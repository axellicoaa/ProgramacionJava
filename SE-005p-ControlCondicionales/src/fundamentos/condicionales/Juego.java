package fundamentos.condicionales;

import java.util.Scanner;

public class Juego 
 //!Juego, piedra, papel y tijera
{
    //static final String LINEA = "Game over :(";
    public static void main(String[] args) 
    {
        
       Scanner ingreso= new Scanner(System.in);
       

       String eleccionUsuario="";
       String eleccionComputadora="";
       String resultado="";
       String Linea = "";
       
       
       //pedir por consola que ingrese  el usuario su opcion

       System.out.print("Ingresar opcion ->piedra, papel, tijera: ");
       eleccionUsuario= ingreso.nextLine();
    
       //Genera la opcion de la computadora --> Usar la clase Math
       
        int numeroAleatorio=(int)(Math.floor (Math.random()*3))+1;
        // System.out.print("Numero: "+ numeroAleatorio);

        //verificar el numero aleatorio y pasarla a tipo cadena
        //!Switch
        switch(numeroAleatorio)
        {
            case 1:
                eleccionComputadora= "piedra";
                break;
            case 2:
                eleccionComputadora= "papel";
                break;
            case 3:
                eleccionComputadora= "tijera";
                break;
            
        }
        System.out.println("Eleccion de computadora:" +eleccionComputadora);
        
        //Indicar el resultado
        switch(eleccionComputadora)
        {
            case "piedra":
                if(eleccionUsuario=="piedra")
                    resultado="Es un empate";
                else if(eleccionUsuario=="papel")
                    resultado = "Tú ganas";  
                else
                    resultado= "Tú pierdes";
                    Linea= "║║║║║█ G A M E  O V E R :( █║║║║║";
                        
                break;

            case "papel":
                if(eleccionUsuario=="piedra")
                    resultado="Tú pierdes";
                else if(eleccionUsuario=="papel")
                    resultado = "Es un empate";
                else
                    resultado= "Tú ganas";
                break;
            case "tijera":
            if(eleccionUsuario=="piedra")
                    resultado="Tú ganas";
                else if(eleccionUsuario=="papel")
                    resultado = "Tú pierdes";
                else
                    resultado= "Es un empate";
                break;
        


        }
        System.out.println("Resultado: " + resultado);
        System.out.println(Linea);

        
    }
    
    
}
