package strategy;

import model.Sensor;

public interface AcionamentoStrategy {
    void executar(Sensor sensor);
}