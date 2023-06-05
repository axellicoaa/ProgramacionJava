package practica.pruebas;

import practica.dominio.Alquiler;
import practica.dominio.Cliente;
import practica.dominio.Empresa;
import practica.dominio.Vehiculo;

public class TestCardinalidadClienteAlquiler 
{
    public static void main(String[] args) 
    {
        Empresa empresa = new Empresa (1,"STOP RENTA CAR");

        Cliente cliente02 = new Cliente(26,"0958744751","Genesis Macias");
        Cliente cliente01= new Cliente(10, "0943883991", "Axel Licoa");

        Vehiculo camioneta =new Vehiculo(25, "Renault", "Oroch");
        Vehiculo sedan= new Vehiculo(42,"Chevrolet","Aveo");

        //!Asociacion cliente-Alquiler
        Alquiler alquiler10 = new Alquiler(689, empresa, cliente01, camioneta);
        Alquiler alquiler20 = new Alquiler(702, empresa, cliente02, sedan);


        
    }
    
    
}
