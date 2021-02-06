package edu.ping.damian.cotxox.develop.domain.carrera;

public class Carrera {

    //propiedades
    private final String tarjetaCredito;
    private String origen = "";
    private String destino = "";
    private double distancia = 0.0d;
    private int tiempoEsperadoMinutos = 0;

    //Constructor
    public Carrera (String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    //getters
    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen(){
        return this.origen;
    }

    public String getDestino(){
        return this.destino;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public void getCosteEstimado(){
        //aloha!
    }
    
     //setters
    public void setOrigen(String origen){
        this.origen = origen;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperadoMinutos){
        this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
    }
}