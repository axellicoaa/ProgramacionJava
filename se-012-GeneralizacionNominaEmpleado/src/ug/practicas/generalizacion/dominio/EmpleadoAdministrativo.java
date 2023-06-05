package ug.practicas.generalizacion.dominio;

public class EmpleadoAdministrativo extends Empleado
{
    private double salario;

    public EmpleadoAdministrativo(int codigo, String cedula, String nombres, double salario) {
        super(codigo, cedula, nombres);
        this.salario = salario;
    }

    @Override
    protected double calcularSalarioNeto() {
        
        super.montoSalarionNeto= this.salario - super.calcularMontoAportacionSeguro(salario, PORCENTAJE_APORTACION_SEGURO);

        return montoSalarionNeto;
    }

    @Override
    public void presentarDatosFiliatorios() {
        
        super.presentarDatosFiliatorios();
        
        System.out.printf("%43s\n", "================= Datos del Salario ==============");
        System.out.printf("Salario: $ %.2f \t\t Porc.Aportacion: %.4f\n",this.salario,PORCENTAJE_APORTACION_SEGURO );
        System.out.printf("Monto Aportaicon: $ %.2f \n", super.calcularMontoAportacionSeguro(this.salario, PORCENTAJE_APORTACION_SEGURO));
        System.out.printf("%s\n", "======================================================");
        System.out.printf("Salario Neto a recibir: %.2f\n", this.calcularSalarioNeto());
        System.out.printf("%s\n","===================================================");
    }
    
    

    
}
