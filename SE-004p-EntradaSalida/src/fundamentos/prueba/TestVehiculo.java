package fundamentos.prueba;

import fundamentos.tipos.Vehiculo;

public class TestVehiculo 
{
    public static void main(String[] args) 
    {
        
        Vehiculo v1= new Vehiculo();
        Vehiculo v2= new Vehiculo();

        //!ingresar datos al objeto
         v1.marca= "Chevrolet";
         v1. anioFabricacion= 2015;
         v1.color= "rojo";
         
        System.out.println(Vehiculo.VELOCIDAD_MAXIMA);



        
    }
    
}
