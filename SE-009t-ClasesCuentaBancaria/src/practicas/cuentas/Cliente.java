package practicas.cuentas;

public class Cliente 
{
    //!Atributos de instancia
    private int codigo;
    private String nombres;
    private String cedula;
  
    public String getNombres() 
    {
        return this.nombres;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getCedula() {
        return cedula;
    }
    public Cliente (int codigo, String nombres)
    {
        this.codigo=codigo;
        this.nombres=nombres;
        
    }

    
}
