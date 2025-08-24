package model;

import java.util.Random;

public class SensorPresenca extends Sensor {
    public SensorPresenca() {
        super("presenca");
    }

    @Override
    public void coletar() {
        valor = new Random().nextInt(2); // 0 ou 1
    }
}