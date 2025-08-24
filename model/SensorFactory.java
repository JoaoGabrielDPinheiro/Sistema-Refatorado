package model;

public class SensorFactory {
    public static Sensor criarSensor(String tipo) {
        return switch (tipo) {
            case "temperatura" -> new SensorTemperatura();
            case "presenca" -> new SensorPresenca();
            default -> throw new IllegalArgumentException("Tipo de sensor inválido");
        };
    }
}