package edu.ping.damian.cotxox.develop.domain.conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {
    //propiedades
    private List<Conductor> pool = new ArrayList<Conductor>();

    //constructor
    public PoolConductores(List<Conductor> conductores){
        this.pool = conductores;
    }
    //setters
    public Conductor asignarConductor(){
        Conductor elelegido = null;
        for (Conductor conductor : pool){
            if (conductor.isOcupado() == false){
                conductor.setOcupado(true);
                elelegido = conductor;
                break;
            }
        }
        return elelegido;
    }
}
