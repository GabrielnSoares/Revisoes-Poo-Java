package br.gabnsoares.dev.cafeteria;

public interface MaquinaCafe {

    // o que será feito, mas não sabe como public abstract

    void ligar();
    void desligar();
    void colocarCachimbo();
    void tirarCachiimbo();
    void selecionarModo(ModoCafe modoCafe);
    void fazerCafe();


}
