package fundamentos.ciclos;
import java.util.Scanner;

public class JuegoAdivinarPara 
{
    public static void main(String[] args) 
    {
        Scanner ingreso= new Scanner(System.in);
        //!Declaración de variable
        int numeroAletorio;
        int numeroIngresado;
        String mensaje;
        int numeroIntentos =5;
        //!resultados
        boolean adivinaste= false;
        int totalIntentos=0;
        //!Desarrollo

        numeroAletorio= (int)(Math.random()*20)+ 1;
        
       
        
        for( int i=0; i<=4; i++)//*Variable de control del ciclo
        {
            System.out.print("Ingresar número: ");
            numeroIngresado=ingreso.nextInt();

            if(numeroIngresado < numeroAletorio)
                mensaje= "número es demasiado bajo!!! intente otra vez";
            else if(numeroIngresado > numeroAletorio)
                mensaje="número es demasiado alto!!! intente otra vez";
            else
            {
                adivinaste= true;
                mensaje ="Adivinaste!!!";
                break;
            }
            System.out.println(mensaje);
            numeroIntentos=numeroIntentos -1; //Todo tiempo actualizar la variable de control
            totalIntentos +=1;

        }

        //!Mostrar el resultado
        if(!adivinaste)
           System.out.println("Perdiste!!! No pudiste adivinar el número");
        else
            System.out.printf("Ganaste!!! adivinaste en %d intentos... \n", totalIntentos);







        
        
    }
}
