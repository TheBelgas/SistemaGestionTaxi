
package Entidades;

public class Taxi {
    private String codigo;
    private String placa;
    private String modelo;
    private boolean estado; //ocupado=true, desocupado=false

    public Taxi(String codigo, String placa, String modelo) {
        this.codigo = codigo;
        this.placa = placa;
        this.modelo = modelo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
