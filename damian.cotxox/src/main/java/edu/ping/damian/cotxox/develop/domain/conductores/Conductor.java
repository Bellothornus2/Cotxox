package edu.ping.damian.cotxox.develop.domain.conductores;

import java.util.List;
import java.util.ArrayList;

public class Conductor {
    //propiedades
    private final String NOMBRE;
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0.0d;
    private List<Byte> valoraciones = new ArrayList<Byte>();
    private boolean ocupado = false;
    private int propina = 0;
    //Constructor
    public Conductor(String nombre){
        this.NOMBRE = nombre;
    }
    //getters
    public boolean getOcupado(){
        return this.ocupado;
    }
    public String getNombre(){
        return this.NOMBRE;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public double getValoracion(){
        return this.valoracionMedia;
    }
    public boolean isOcupado(){
        return this.ocupado;
    }
    public int getPropina(){
        return this.propina;
    }
    //setters
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setValoracion(byte valoracion){
        double total = 0.0d;
        this.valoraciones.add(valoracion);
        for (Byte contenido : valoraciones) {
            total += contenido;
        }
        double media = total / this.valoraciones.size();
        this.valoracionMedia = media;
    }
    public void setPropina(int propina){
        this.propina += propina;
    }
}
