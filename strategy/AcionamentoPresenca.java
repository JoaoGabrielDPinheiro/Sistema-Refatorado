package strategy;

import model.Sensor;

public class AcionamentoPresenca implements AcionamentoStrategy {
    @Override
    public void executar(Sensor sensor) {
        if (sensor.getTipo().equals("presenca") && sensor.getValor() > 0) {
            System.out.println("Acionando luz por presença detectada.");
        }
    }
}