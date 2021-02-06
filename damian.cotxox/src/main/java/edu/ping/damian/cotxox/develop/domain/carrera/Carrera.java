package edu.ping.damian.cotxox.develop.domain.carrera;

public class Carrera {

    //propiedades
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0.0d;
    private int tiempoEsperadoMinutos = 0;

    //Constructor
    public Carrera (String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    //getters

    //setters
    public void setOrigen(String origen){
        this.origen = origen;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }
}