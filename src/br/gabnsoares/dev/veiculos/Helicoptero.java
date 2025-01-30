package br.gabnsoares.dev.veiculos;

public class Helicoptero extends VeiculoAereo {
    @SuppressWarnings("FieldCanBeLocal")
    public final int numeroHelices;

    public Helicoptero(String marca, int anoFabricacao, int altitudeMaxima, int autonomia, int numeroHelices) {
        super(marca, anoFabricacao, altitudeMaxima, autonomia);
        this.numeroHelices = numeroHelices;
    }

    public void parar() {
        System.out.println("Helicoptero  pairando no ar");
    }
}
