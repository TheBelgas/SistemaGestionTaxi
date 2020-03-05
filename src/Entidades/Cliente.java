
package Entidades;

import Enumerados.TipoCliente;

public class Cliente extends Usuario{
    private TipoCliente tipo;
    
    public Cliente(String nombre, String dni, String id_user, String password) {
        super(nombre, id_user, password);
        this.dni=dni;
    }
    
    public Cliente(String nombre, String Paterno, String Materno, String dni, int edad, String sexo, String numeroTelf, String correo, String id_user, String password){
        super(nombre, Paterno, Materno, dni, edad, sexo, numeroTelf, correo, id_user, password);
    }
    
    public void setTipoCliente(TipoCliente tipo){
        this.tipo=tipo;
    }
    
    public boolean solicitarServicio(){
        return true;
    }
}
