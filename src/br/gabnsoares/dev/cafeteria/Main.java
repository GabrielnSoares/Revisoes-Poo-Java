package br.gabnsoares.dev.cafeteria;

public class Main {

    public static void main(String[] args) {

        DolceGusto dolceGusto = new DolceGusto();

        dolceGusto.ligar();
        dolceGusto.colocarCachimbo();

        dolceGusto.selecionarModo(ModoCafe.AMERICANO);
        dolceGusto.fazerCafe();

        dolceGusto.selecionarModo(ModoCafe.PINGADO);
        dolceGusto.fazerCafe();

        dolceGusto.selecionarModo(ModoCafe.EXPRESSO);
        dolceGusto.fazerCafe();
        dolceGusto.desligar();
        dolceGusto.tirarCachiimbo();
    }
}
