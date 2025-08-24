package observer;

import model.Sensor;

public class Luz implements SensorObserver {
    @Override
    public void atualizar(Sensor sensor) {
        if (sensor.getTipo().equals("presenca") && sensor.getValor() > 0) {
            System.out.println("Observer: Luz acesa por presença.");
        }
    }
}