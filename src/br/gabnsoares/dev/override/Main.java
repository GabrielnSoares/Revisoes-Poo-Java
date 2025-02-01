package br.gabnsoares.dev.override;

public class Main {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro("TOBY");
        cachorro.emitirSom();

        Animal gato = new Gato("Tica");
        gato.emitirSom();

        Animal leao = new Leao("Mufasa");
        leao.emitirSom();
    }
}
