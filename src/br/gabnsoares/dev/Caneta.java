package br.gabnsoares.dev;

public class Caneta {

    String cor;
    String marca;
    double ponta;
    int carga;
    boolean tampada;

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void escrever(String texto) {
        System.out.println("Escrevendo: " + texto);
    }
}
