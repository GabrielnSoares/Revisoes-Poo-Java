package br.gabnsoares.dev.overload;
@SuppressWarnings("unused")
public class Calculadora {

    private int bateria;

    public int somar(int a, int b) { // somar(int,  int)
        return a  + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public long somar(long a, long b) {
        return a + b;
    }

    public float somar(float a, float b) {
        return a + b;
    }
}
