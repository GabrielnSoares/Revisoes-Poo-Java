package br.gabnsoares.dev.veiculos;

public abstract class Veiculo {

    protected String marca;
    protected int anoFabricacao;

    public Veiculo(String marca, int anoFabricacao) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public void ligar() {
        System.out.println("Ligando veículo!");
    }

    public void desligar() {
        System.out.println("Desligando o veículo");
    }
}
