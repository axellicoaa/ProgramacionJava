package practica.pruebas;

import practica.dominio.*;

public class TestAlquilerVehiculo 
{
    public static void main(String[] args) {
    
        Empresa empresa= new Empresa(10,"Stop Renta Car");
        Cliente cliente= new Cliente(23, "0943883991", "Axel Licoa");
        Vehiculo coche = new Vehiculo(5, "BMW", "M4");
        /*
        empresa.presentarDatos();
        cliente.presentarDatos();
        coche.presentarDatos();
        */
        Alquiler alquiler= new Alquiler(154, empresa, cliente , coche, 450);
        alquiler.presentarDatos();


    }
    
}
