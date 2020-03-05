
package Entidades;

public class Usuario extends Persona{
    private String id_user;
    private String password;
    protected boolean acceso;
    private boolean activo;
    private boolean logueado;

    public Usuario(){
    }
    
    public Usuario(String nombre, String id_user, String password) {
        this.nombre = nombre;
        this.id_user = id_user;
        this.password = password;
        this.logueado=false;
        this.activo=true;
        this.acceso=false;
    }

    public Usuario(String nombre, String Paterno, String Materno, String dni, int edad, String sexo, String numeroTelf, String correo, String id_user, String password) {
        this.nombre = nombre;
        this.APaterno = Paterno;
        this.AMaterno = Materno;
        this.dni = dni;
        this.id_user = id_user;
        this.password = password;
        this.edad = edad;
        this.Sexo = sexo;
        this.correo = correo;
        this.numeroTelf = numeroTelf;
        this.logueado=false;
        this.activo=true;
        this.acceso=false;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getId_user() {
        return id_user;
    }
    
    public boolean getAcceso(){
        return acceso;
    }

    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
        
    public String getDni() {
        return dni;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public boolean entrar(String id, String pass){
        boolean dentro=false;
        if(this.getId_user().equalsIgnoreCase(id)&&this.password.equals(pass)&&!this.isLogueado()&&this.isActivo()){
            this.logueado=true;
            dentro=true;
        }
        return dentro;
    }
    
    public boolean salir(){
        boolean fuera = false;
        if(isLogueado()){
            this.logueado = false;
            fuera = true;
        }
        return fuera;
    }
   
}
