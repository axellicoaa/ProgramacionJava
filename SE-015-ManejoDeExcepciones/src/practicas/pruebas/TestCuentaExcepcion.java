package practicas.pruebas;

import practicas.dominio.Cuenta;
import practicas.excepciones.CuentaBancariExcepcion;

public class TestCuentaExcepcion 
{
    public static void main(String[] args) {
        Cuenta cuenta= new Cuenta();
        try
        {
            cuenta.apertura(35);
        }
        catch(CuentaBancariExcepcion cbe){
        System.out.print(cbe.getMessage());
        }
    }

    
}
