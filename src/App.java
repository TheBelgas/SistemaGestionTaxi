
import Entidades.*;
import Formularios.*;
import Configuracion.Sistema;
import static Enumerados.TipoCliente.*;

public class App {
  
    public static void main(String arg[]){
        //ADMINISTRADORES
        Sistema.usuarios.agregarUsuario(new Administrador("Alvaro","70768167", "AlvaroHJ21", "1921"));
        Sistema.usuarios.agregarUsuario(new Administrador("Paiva","87654321", "Paiva", "123"));
        Sistema.usuarios.agregarUsuario(new Administrador("Luis","12345678", "delfin", "1998"));
        //CLIENTES
        Sistema.usuarios.agregarUsuario(new Cliente("Alvaro", "Huaysara", "Jauregui", "76543212", 20, "masculino", "926513695", "alvarohuaysara@gmail.com", "Alvaro21", "1921"));
        
        Sistema.usuarios.agregarUsuario(new Cliente("Paiva", "87654322", "Paivita", "123"));
        Sistema.usuarios.agregarUsuario(new Cliente("Luis", "12345679", "Manito", "321"));
        Sistema.usuarios.agregarUsuario(new Cliente("Laura", "14785237", "Mapache", "132"));
        //TAXIS
        Sistema.taxis.AgregarTaxi(new Taxi("123", "ABC", "Yaris"));
        Sistema.taxis.AgregarTaxi(new Taxi("124", "DEF", "Kia"));
        Sistema.taxis.AgregarTaxi(new Taxi("126", "GHI", "Mundo"));
        
        Inicio login1=new Inicio();
        login1.setVisible(true);
        login1.setLocationRelativeTo(null);
    }        
}
