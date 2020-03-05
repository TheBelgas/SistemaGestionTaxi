
package Colecciones;

import Entidades.*;
import java.util.ArrayList;

public class ArregloUsuarios {
    private ArrayList <Usuario> usuarios;
    
    public ArregloUsuarios(){
        this.usuarios = new ArrayList<Usuario>();
    }
    
    public boolean agregarUsuario(Usuario usuario){
        boolean agregado=false;
        if(!buscar(usuario.getDni())){
            this.usuarios.add(usuario);
            agregado=true;
        }
        return agregado;
    }
    
    public boolean buscar(String dni){
        boolean encontrado=false;
        for(Usuario u : this.usuarios){
            if(dni.equals(u.getDni())){
                encontrado=true;
                break;
            }
        }
        return encontrado;
    }
    
    public Usuario getUsuario(String dni){
        Usuario user=null;
        for(Usuario u : this.usuarios){
            if(dni.equals(u.getDni())){
                user=u;
                break;
            }
        }
        return user;
    }
    
    public Usuario validar(String id,String pass){
        Usuario user=null;
        for(Usuario u: usuarios){
            if(u.entrar(id, pass)){
                user=u;
            }
        }
        return user;
    }
    
    public String[] getTitulosClientes(){
        String[] titulos={"DNI","Nombre","User_Ide"};
        return titulos;
    }
    
    public String[][] getClientes(){
        int n=contarClientes();
        String[][] c=new String[n][3];
        int i=0;
        for(Usuario u: this.usuarios){
            if(u instanceof Cliente){
                c[i][0]=u.getDni();
                c[i][1]=u.getNombre();
                c[i][2]=u.getId_user();
                i++;
            }
        }
        return c;
    }
    
    public int contarClientes(){
        int n=0;
        for(Usuario u: this.usuarios){
            if(u instanceof Cliente){
                n++;
            }
        }
        return n;
    }
    
    public int getIndexUsuario(String dni){
        int index=0;
        for(int i=0;i<this.usuarios.size();i++){
            if(dni.equals(this.usuarios.get(i).getDni())){
                index=i;
                break;
            }
        }
        return index;
    }
    
    public boolean eliminarUsuario(String dni){
        boolean eliminado = false;
        int indice = getIndexUsuario(dni);
        if(buscar(dni)){
            this.usuarios.remove(indice);
            eliminado = true;
        }
        return eliminado;
    }
    
    public boolean modificarUsuario(String dni, Usuario usuario){
        boolean modificado = false;
        if(eliminarUsuario(dni)){
            this.usuarios.add(getIndexUsuario(dni), usuario);
            modificado = true;
        }
        return modificado;
    }
   
}
