

import model.*;
import strategy.*;
import observer.*;
import decorator.*;

public class Main {
    public static void main(String[] args) {
        Sala sala = new Sala("Sala 101");

        Sensor temperatura = SensorFactory.criarSensor("temperatura");
        Sensor presenca = SensorFactory.criarSensor("presenca");

        SensorDecorator decorado = new SensorDecorator(presenca);

        sala.adicionarSensor(temperatura);
        sala.adicionarSensor(decorado);

        sala.adicionarObserver(new Luz());

        sala.setStrategy(new AcionamentoPresenca());

        sala.coletarDados();
        sala.acionarAcoes();
        sala.gerarRelatorio();
    }
}