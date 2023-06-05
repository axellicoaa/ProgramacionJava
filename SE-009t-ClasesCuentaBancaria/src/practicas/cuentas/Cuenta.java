package practicas.cuentas;

import java.time.LocalDate;

public class Cuenta 
{
    static final double SALDO_MINIMO = 60.00;
    static final String Proceso= "CONSULTA DE SALDO";
    static final String LINEA= "████████████████████████████████████████████████████████████████";
    //!Atributos de instancias
    private int numero;
    private LocalDate fechaApertura;
    private double saldo;
    private boolean estaAperturada=false;
   
    //*Referencia a entidad cliente */

    private static Cliente titular;
    private static Banco banco;
    
    //Metodos de acceso
    public void setTitular(Cliente titular) {
        Cuenta.titular = titular;
    }
    public void setBanco(Banco miBanco) {
        Cuenta.banco = miBanco;
    }
    
    //todos metodos de negocios

    public void apertura(double monto)
    {
        if (monto >= SALDO_MINIMO)
        {
        this.fechaApertura =LocalDate.now();
        this.numero=(int) (Math.random()*1000) + 1;
        this.saldo=monto;
        this.estaAperturada=true;
        System.out.printf("Cuenta Aperturada N°: %08d saldo: $%.2f \n", numero, saldo);
        }
        else
           
        System.out.printf("el monto: $%.2f es inferior al saldo minimo: $%.2f No se puede aperturar la cuenta \n", monto, SALDO_MINIMO);


    }
   
    public void deposito ( double monto)
    {
        if(this.estaAperturada){
            this.saldo= saldo+monto;
            System.out.printf("<<deposito>> monto: $%.2f saldo actual: $%.2f\n", monto, saldo);

        }
        else
            System.out.println("<<Alerta>> La cuenta no ha sido aperturada!!! \n");

    }
    public void retiro (double monto)
    {
        if (this.estaAperturada){

            this.saldo = saldo - monto;
    

        }else{

            System.out.print("La cuenta no esta activa");

        }

    }
    public void consultadoSaldo()
    {
    System.out.println(LINEA);
    //*Traer los nombre del cliente de la cuenta */
    System.out.printf("%36s\n", banco.getBanco());
    System.out.printf("%37s\n", Proceso);
    System.out.println(LINEA);
    System.out.printf("NUMERO CUENTA %08d\n", numero);
    System.out.printf("Cliente: %s \n", titular.getNombres());
    System.out.printf("Fecha de Apertura: %s \t Saldo actual: $%.2f\n",fechaApertura, saldo);
    System.out.println(LINEA);


    }

    
}
