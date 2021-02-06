package edu.ping.damian.cotxox.develop.domain.carrera;

import org.junit.Before;

public class CarreraTest {

    //propiedades
    private final String tarjetaCredito = "4916119711304546";
    private Carrera carrera;

    @Before
    public void setupCarrera(){
        this.carrera = new Carrera(this.tarjetaCredito);
        this.carrera.setOrigen("Aeroport Son Sant Joan");
        this.carrera.setDestino("Magaluf");
        this.carrera.setDistancia(7.75);
        this.carrera.setTiempoEsperado(10);
    }
}
