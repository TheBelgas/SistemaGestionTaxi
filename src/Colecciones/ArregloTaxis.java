
package Colecciones;

import Entidades.Taxi;
import java.util.ArrayList;

public class ArregloTaxis {
    private ArrayList <Taxi> taxis;
    
    public ArregloTaxis(){
        this.taxis = new ArrayList<Taxi>();
    }
    
    public boolean AgregarTaxi(Taxi taxi){
        boolean agregado = false;
        if(!buscar(taxi.getCodigo())){
            this.taxis.add(taxi);
            agregado=true;
        }
        return agregado;
    }
    
    public boolean buscar(String codigo){
        boolean encontrado=false;
        for(Taxi tx: this.taxis){
            if(codigo.equals(tx.getCodigo())){
                encontrado=true;
            }
        }
        return encontrado;
    }
    
    public Taxi getTaxi(String codigo){
        Taxi taxi=null;
        for(Taxi tx: this.taxis){
            if(codigo.equals(tx.getCodigo())){
                taxi=tx;
                break;
            }
        }
        return taxi;
    }
    
    public String[] getTitulosTaxis(){
        String[] titulos={"Codigo","Placa","Modelo"};
        return titulos;
    }
    
    public String[][] getTaxis(){
        String[][] t=new String[this.taxis.size()][3];
        int i=0;
        for(Taxi tx: this.taxis){
                t[i][0]=tx.getCodigo();
                t[i][1]=tx.getPlaca();
                t[i][2]=tx.getModelo();
                i++;
        }
        return t;
    }
}
