package model;

public abstract class Sensor {
    protected String tipo;
    protected int valor;

    public Sensor(String tipo) {
        this.tipo = tipo;
    }

    public abstract void coletar();

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}