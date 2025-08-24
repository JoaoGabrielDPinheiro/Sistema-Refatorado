package decorator;

import model.Sensor;

public class SensorDecorator extends Sensor {
    private final Sensor sensorOriginal;

    public SensorDecorator(Sensor sensorOriginal) {
        super(sensorOriginal.getTipo());
        this.sensorOriginal = sensorOriginal;
    }

    @Override
    public void coletar() {
        sensorOriginal.coletar();
        this.valor = sensorOriginal.getValor();
        System.out.println("Log: Sensor " + tipo + " coletado com valor " + valor);
    }
}