package edu.ping.damian.cotxox.develop.domain.tarifa;

import edu.ping.damian.cotxox.develop.domain.carrera.Carrera;
public class Tarifa {
    //propiedades
    private final static double COSTE_MILLA = 1.35d;
    private final static double COSTE_MINUTO = 0.35d;
    private final static double COSTE_MINIMO = 5.0d;
    private final static double PORCENTAJE_COMISION = 0.2;

    //Constructor
    /*
    porque el de por defecto es público
    y esto es una clase estática
    */
    private Tarifa(){}

    //getters
    private static double getCosteDistancia(double distancia){
        return distancia * Tarifa.COSTE_MILLA;
    }
    private static double getCosteTiempo(double minutos){
        return minutos * Tarifa.COSTE_MINUTO;
    }
    public static double getCosteTotalEsperado(Carrera carrera){
        //El coste total no puede ser inferior al mínimo
        double total = Tarifa.getCosteDistancia(carrera.getDistancia()) +
        Tarifa.getCosteTiempo(carrera.getTiempoEsperado());
        if (total < Tarifa.COSTE_MINIMO){
            total = 5.0d;
        }
        return total;
    }
}
