package observer;

import model.Sensor;

public interface SensorObserver {
    void atualizar(Sensor sensor);
}