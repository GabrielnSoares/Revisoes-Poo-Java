package br.gabnsoares.dev.estadio;

public class Jogador {

    protected String nome;
    protected int numero;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void treinar () {
        System.out.println("Treinando");
    }
}
