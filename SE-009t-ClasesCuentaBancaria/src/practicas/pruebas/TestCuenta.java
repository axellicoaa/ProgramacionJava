package practicas.pruebas;
import practicas.cuentas.Cuenta;
import practicas.cuentas.Cliente;
import practicas.cuentas.Banco;
public class TestCuenta 
{
    public static void main(String[] args) 
    {
        Banco miBanco= new Banco("BANCO MERCANTIL");
        Cliente cliente =new Cliente(10,"Axel Licoa");

        Cuenta miCuenta= new Cuenta();
        miCuenta.setTitular(cliente);
        miCuenta.setBanco(miBanco);
        miCuenta.apertura(30);
        miCuenta.apertura(85);
        miCuenta.deposito(25.30);
        miCuenta.deposito(15.80);
        miCuenta.retiro(15);
        miCuenta.consultadoSaldo();
        
        
        
    }
    
}
