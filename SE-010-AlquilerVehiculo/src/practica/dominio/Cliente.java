package practica.dominio;

public class Cliente 
{
    private int codigo;
    private String cedula;
    private String nombres;
    //#region Constructores

    public Cliente() {
    }
    public Cliente(int codigo, String cedula, String nombres) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
    }
    //#endregion
    public void presentarDatos(){
        System.out.printf("Codigo: %d\nCedula: %s \t\t Nombres: %s \n ",codigo,cedula,nombres);

    }
    
}
