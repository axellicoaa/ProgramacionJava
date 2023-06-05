package practica.dominio;

public class Alquiler 
{
    private final String LINEA ="==================================================================";
    //!Atributos de clase
    //#region Atributos de clase
    private static final double IMPUESTO_VALOR_AGREGADO=0.12;
    private static final double RECORRIDO_150=150;
    private static final double RECORRIDO_500=500;
    private static final double COSTO_RECORRIDO_BASE=25.00;
    private static final double COSTO_RECORRIDO_150_500= 5.00;
    private static final double COSTO_RECORRIDO_MAS_500= 3.5;
    //#endregion
    
    
    //!Variables de instancias
    private double numero;
    private double recorrido;
    private double subTotal;
    private double montoIva;
    private double total;

    //!Enlaces con las otras entidades
    private Empresa miEmpresa;
    private Cliente miCliente;
    private Vehiculo miVehiculo;
    //!Constructor
public Alquiler(double numero, Empresa miEmpresa, Cliente miCliente, Vehiculo miVehiculo) {
        this.numero = numero;
        this.miEmpresa = miEmpresa;
        this.miCliente = miCliente;
        this.miVehiculo = miVehiculo;
    }

    
public Alquiler(double numero,  Empresa miEmpresa, Cliente miCliente, Vehiculo miVehiculo, double recorrido) {
    this.numero = numero;
    this.recorrido = recorrido;
    this.miEmpresa = miEmpresa;
    this.miCliente = miCliente;
    this.miVehiculo = miVehiculo;
}


public void presentarDatos(){
    System.out.printf("%s \n", LINEA);
    miEmpresa.presentarDatos();
    System.out.printf("%s \n", LINEA);
    miCliente.presentarDatos();
    System.out.printf("%s \n", LINEA);
    miVehiculo.presentarDatos();
    System.out.printf("%s \n", LINEA);
    //! Invocar subtotal
    System.out.printf("RECORRIDO: %.2f \n", this.recorrido);
    System.out.printf("SUBTOTAL: $%.2f \t IVA: %.2f \n", this.calcularSubtotal(this.recorrido),IMPUESTO_VALOR_AGREGADO);
    System.out.printf("IVA: %s\n", calculoIva(subTotal));
    System.out.printf("TOTAL: %s\n", calculoTotal(subTotal, montoIva));
    System.out.printf("%s\n", LINEA);

    
}

private double calcularSubtotal( double kilometrajeActual){

    //? Reglas de negocio
    if (kilometrajeActual <=150)
        subTotal= COSTO_RECORRIDO_BASE;
    else if (kilometrajeActual <=RECORRIDO_500)
        subTotal=COSTO_RECORRIDO_BASE+
                    (kilometrajeActual-RECORRIDO_150)*COSTO_RECORRIDO_150_500;
    else
        subTotal=COSTO_RECORRIDO_BASE+
                (RECORRIDO_500-RECORRIDO_150)*COSTO_RECORRIDO_150_500 +
                (kilometrajeActual-RECORRIDO_500)*COSTO_RECORRIDO_MAS_500;
    return subTotal;
}
private double calculoIva(double subTotal){

    montoIva = subTotal * IMPUESTO_VALOR_AGREGADO;

    return montoIva;

}
private double calculoTotal(double subTotal, double montoIva){

    total = subTotal + montoIva;

    return total;

}




    
}
