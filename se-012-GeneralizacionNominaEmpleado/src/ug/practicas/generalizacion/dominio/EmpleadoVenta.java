package ug.practicas.generalizacion.dominio;

public class EmpleadoVenta extends Empleado
{
    


    protected final static double PORCENTAJE_COMISION_VENTA= 0.08;
    protected final static double  SALARIO_MINIMO= 420.00;


    protected double montoVentas;
    protected double montoComisionVenta;
    // protected double montoSalarionNeto;

    public EmpleadoVenta(int codigo, String cedula, String nombres, double montoVenta) {
        super(codigo, cedula, nombres);
        this.montoVentas=montoVenta;
      
    }
    private double calcularMontoComisionVenta(double totalVentas, double porcentajeComision){
    montoComisionVenta=totalVentas*porcentajeComision;
    return montoComisionVenta;

    }

    @Override
    protected double calcularSalarioNeto() {
        
        super.montoSalarionNeto= SALARIO_MINIMO - super.montoAportacion + this.montoComisionVenta;

        return montoSalarionNeto;
        
    }
    @Override
    public void presentarDatosFiliatorios() {
       
        super.presentarDatosFiliatorios();
        System.out.printf("%35s\n", "================== Datos Salario ==============");
        System.out.printf("Salario Basico: %.2f\n", SALARIO_MINIMO);
        System.out.printf("Monto de aportacion IESS: $ %.2f\n", super.calcularMontoAportacionSeguro(SALARIO_MINIMO, PORCENTAJE_APORTACION_SEGURO));

        System.out.printf("TotalVentas: $ %.2f \t\t  Porc.Comision: %.2f\n", 
                                    this.montoVentas, PORCENTAJE_COMISION_VENTA);
        System.out.printf("Monto Comision: %.2f\n", calcularMontoComisionVenta
                                            (montoVentas, PORCENTAJE_COMISION_VENTA));
        System.out.printf("%s\n","===================================================");
        System.out.printf("Salario Neto a recibir: $ %.2f\n", this.calcularSalarioNeto());
        System.out.printf("%s\n","===================================================");
    }

    
}
