package ug.practicas.generalizacion.pruebas;

import ug.practicas.generalizacion.dominio.Empleado;
import ug.practicas.generalizacion.dominio.EmpleadoAdministrativo;
import ug.practicas.generalizacion.dominio.EmpleadoVenta;

public class TestNominaEmpleado 
{
    public static void main(String[] args) 
    {
    Empleado contador= new EmpleadoAdministrativo(10,"0943883991", "Axel Licoa", 1250.36);
   // contador.presentarDatosFiliatorios();

    Empleado vendedor= new EmpleadoVenta(20, "0943883991", "Ismael Mata", 1500.00);
     vendedor.presentarDatosFiliatorios();

        
    }

    
}
