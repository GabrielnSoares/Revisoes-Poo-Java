package br.gabnsoares.dev.override;

public abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som do Animal");
    }
}
