package br.gabnsoares.dev.fazenda;

import java.time.LocalDateTime;

public class Galinheiro {

    private final String nome;
    private final int qtdGalinhas;
    private final int ovodPorDiaPorGalinha;
    private final LocalDateTime dataHoraCriacao;

    public Galinheiro (String nome,
                       int qtdGalinhas,
                       int ovodPorDiaPorGalinha) {
        this.nome = nome;
        this.qtdGalinhas = qtdGalinhas;
        this.ovodPorDiaPorGalinha = ovodPorDiaPorGalinha;
        this.dataHoraCriacao = LocalDateTime.now();
    }

    public int calcularProdDiaria() {
        return this.qtdGalinhas * this.ovodPorDiaPorGalinha;
    }

    public int calcularProdMensal () {
        return  this.calcularProdDiaria() * 30;
    }

    public void mostrarInfo () {
        System.out.println("============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade de Galinhas: " + this.qtdGalinhas);
        System.out.println("Quantiade de Ovos por dia por Galinha: " + this.ovodPorDiaPorGalinha);
        System.out.println("Data e Hora de Criação: " + this.dataHoraCriacao);
        System.out.println("Produção Diária de Ovos:" + this.calcularProdDiaria() + " ovos");
        System.out.println("Produção Mensal de Ovos: " + this.calcularProdMensal() + " ovos");
        System.out.println("============");
    }
}
