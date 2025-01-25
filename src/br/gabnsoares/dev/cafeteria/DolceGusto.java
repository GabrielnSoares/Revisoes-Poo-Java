package br.gabnsoares.dev.cafeteria;

public class DolceGusto implements MaquinaCafe {

    private boolean ligada;
///    private boolean resistenciaLigada;
    private boolean possuiCachimbo;
    private ModoCafe modoCafeSelecionado;
    private int qtdAguaCaldeira;

    @Override
    public void ligar() {
        System.out.println("Ligando a Dolce Gusto...");
        this.ligada = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a Dolce Gusto...");
        this.ligada = false;

    }

    @Override
    public void colocarCachimbo() {
        System.out.println("Cachimbo inserido na Dolce Gusto.");
        this.possuiCachimbo = true;

    }

    @Override
    public void tirarCachiimbo() {
        System.out.println("Cachimbo retirado da Dolce Gusto.");
        this.possuiCachimbo = false;

    }

    @Override
    public void selecionarModo(ModoCafe modoCafe) {
        System.out.println("Modo de café selecionado: " + modoCafe.getDescricao());
        this.modoCafeSelecionado = modoCafe;
    }

    @Override
    public void fazerCafe() {
        if (this.isLigada()) {
            if (this.possuiCachimbo) {

                if (this.modoCafeSelecionado != null) {
                    this.injetarAguaCaldeira(300);
                    this.ligarResistencia();

                    System.out.println("Fazendo  " + this.modoCafeSelecionado.getDescricao() + "...");
                    System.out.println("Cafe pronto!");

                    this.esvaziarCaldeira();
                    this.desligarResistencia();

                } else {
                    System.out.println("Modo de café não está selecionado. Selecione antes de prosseguir");
                }

            } else {
                System.out.println("Dolce Gusto está sem cachimbo. Coloque o cachimbo com o pó de cadé");
            }

        } else {
            System.out.println("Cafeteira Dolce está desligada.");
        }

    }

    private boolean isLigada() {
        return this.ligada;
    }
    @SuppressWarnings("SameParameterValue")
    private void injetarAguaCaldeira (int qtdAguaCaldeira) {
        System.out.println("INJETANDO " + qtdAguaCaldeira + "ML DE ÁGUA NA CALDEIRA...");
        this.qtdAguaCaldeira = qtdAguaCaldeira;
    }

    private void esvaziarCaldeira() {
        System.out.println("Esvaziando " + this.qtdAguaCaldeira + "ML a caldeira...");
        this.qtdAguaCaldeira = 0;
        System.out.println("Caldeira esvaziada...");
    }

    private void ligarResistencia() {
        System.out.println("Ligando a resistência...");
///        this.resistenciaLigada = true;
    }

    private void desligarResistencia() {
        System.out.println("Desligando a resistência...");
///        this.resistenciaLigada = false;
    }
}
