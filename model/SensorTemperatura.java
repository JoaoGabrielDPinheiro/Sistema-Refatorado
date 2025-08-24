package model;

import java.util.Random;

public class SensorTemperatura extends Sensor {
    public SensorTemperatura() {
        super("temperatura");
    }

    @Override
    public void coletar() {
        valor = new Random().nextInt(35); // Temperatura simulada
    }
}