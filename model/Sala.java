package model;

import strategy.AcionamentoStrategy;
import observer.SensorObserver;
import java.util.*;

public class Sala {
    private String nome;
    private List<Sensor> sensores = new ArrayList<>();
    private List<SensorObserver> observers = new ArrayList<>();
    private AcionamentoStrategy strategy;

    public Sala(String nome) {
        this.nome = nome;
    }

    public void adicionarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void adicionarObserver(SensorObserver observer) {
        observers.add(observer);
    }

    public void setStrategy(AcionamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void coletarDados() {
        for (Sensor s : sensores) {
            s.coletar();
            for (SensorObserver o : observers) {
                o.atualizar(s);
            }
        }
    }

    public void acionarAcoes() {
        for (Sensor s : sensores) {
            strategy.executar(s);
        }
    }

    public void gerarRelatorio() {
        System.out.println("Relatório da " + nome);
        for (Sensor s : sensores) {
            System.out.println(s.getTipo() + ": " + s.getValor());
        }
    }
}