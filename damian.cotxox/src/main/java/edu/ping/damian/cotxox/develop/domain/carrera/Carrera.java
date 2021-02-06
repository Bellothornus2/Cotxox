package edu.ping.damian.cotxox.develop.domain.carrera;

import edu.ping.damian.cotxox.develop.domain.conductores.Conductor;
import edu.ping.damian.cotxox.develop.domain.conductores.PoolConductores;
import edu.ping.damian.cotxox.develop.domain.tarifa.Tarifa;

public class Carrera {

    //propiedades
    private final String tarjetaCredito;
    private String origen = "";
    private String destino = "";
    private double distancia = 0.0d;
    private int tiempoEsperadoMinutos = 0;
    private double costeTotal = 0.0d;
    private Conductor conductor = null;

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
    public int getTiempoEsperado(){
        return this.tiempoEsperadoMinutos;
    }
    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }
    public double getCosteTotal(){
        return this.costeTotal;
    }
    public Conductor getConductor(){
        return this.conductor;
    }
    public int getPropina(){
        return this.conductor.getPropina();
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
    public void asignarConductor(PoolConductores conductores){
        this.conductor = conductores.asignarConductor();
    }
    public void realizarPago(double pago){
        this.costeTotal = pago;
    }
    public void recibirPropina(int propina){
        this.conductor.setPropina(propina);
    }
    public void liberarConductor(){
        this.conductor.setOcupado(false);
    }
}