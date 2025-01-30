package br.gabnsoares.dev.veiculos;

public class Moto extends VeiculoTerrestre {

    final int cilindradas;

    public Moto(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, int cilindradas) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas);
        this.cilindradas = cilindradas;
    }

    public void empinar() {
        System.out.println("Dando grau!");
    }
}
