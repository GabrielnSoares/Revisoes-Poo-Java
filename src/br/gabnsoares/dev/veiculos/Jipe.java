package br.gabnsoares.dev.veiculos;

public final class Jipe extends Carro {
    @SuppressWarnings("FieldCanBeLocal")
    final int capacidadeCarga;

    public Jipe(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, String tipoCombustivel, int qtdPortas, int capacidadeCarga) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas, tipoCombustivel, qtdPortas);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void ativarModoOffRoad() {
        System.out.println("Ativando o modo off road!");
    }
}
