package practicas.dominio;

import practicas.excepciones.CuentaBancariExcepcion;

public class Cuenta 
{
    static final double SALARIO_MINIMO=50.00;
    private double saldoActual;

    public double apertura ( double monto) throws CuentaBancariExcepcion
    {
        if (monto < SALARIO_MINIMO)
        {
            // System.out.println("Excepcion!!! El saldo minímo para aperturar una cuenta es: "+SALARIO_MINIMO);
            //throw new Exception("el monto es menor al saldo minimo de apertura permitido!!!!");
            throw new CuentaBancariExcepcion("El monto a depositar es menor al saldo minimo");
        }
        else{
            saldoActual=monto;
        }
        return saldoActual;
    }
    
}
