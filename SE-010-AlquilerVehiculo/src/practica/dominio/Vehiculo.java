package practica.dominio;

public class Vehiculo 
{
    private int codigo;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private String placa;
    private int numeroPasajeros;
    //#region Constructores
    public Vehiculo() {
    }
    public Vehiculo(int codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Vehiculo(int codigo, String marca, String modelo, int anioFabricacion, String placa, int numeroPasajeros) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.placa = placa;
        this.numeroPasajeros = numeroPasajeros;
    }
    //#endregion
    
    public void presentarDatos(){
        System.out.printf("Codigo: %d \n",codigo );
        System.out.printf("Marca: %s \t\t Modelo: %s \n",marca,modelo);
    }
}
