package mascotapp.entidades;
 import java.util.date;

public class Usuario {
    
    
    public String nombre;
    public String apellido;
    public int dni;
    public date nacimiento;
    public String pais;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
}
