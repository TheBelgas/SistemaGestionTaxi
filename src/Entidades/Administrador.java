
package Entidades;

public class Administrador extends Usuario{
    
    public Administrador(String nombre, String dni, String id_user, String password) {
        super(nombre, id_user, password);
        this.dni=dni;
    }
}
