package fundamentos.tipos;

import java.time.LocalDate;


public class Empleado 
{
    public String cedula; 
    public String nombres;
    public LocalDate fechaIngreso;
    public double salario;
    
    public static void main(String[] args) 
    {
        Empleado e = new Empleado();
        Empleado d;

        e.cedula= "0943883991";
        e.nombres= "Axel Licoa";
        e.fechaIngreso= LocalDate.now();
        e.salario= 0;

        System.out.println("Cédula: "+ e.cedula);
        System.out.println("Fecha de ingreso: " + e.fechaIngreso);
        System.out.println("Salario: "+ e.salario);



        
    }
    
}
