package br.gabnsoares.dev.pesqueiro;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Pesqueiro {

    private final String nome;
    private final int qtdPeixes;
    private final String[] tiposPeixe;
    private final LocalDateTime dataHoraCriacao;

    public Pesqueiro (String nome,
                      int qtdPeixes,
                      String[] tiposPeixe) {
        this.nome = nome;
        this.qtdPeixes = qtdPeixes;
        this.tiposPeixe = tiposPeixe;
        this.dataHoraCriacao = LocalDateTime.now();
    }

    public int calculaPescaDiaria() {
        return this.qtdPeixes - 30;
    }

    public int calculaPescaMensal() {
        return this.calculaPescaDiaria() * 30;
    }

    public void mostrarInfo() {
        System.out.println("============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade de Peixes: " + this.qtdPeixes);
        System.out.println("Tipos de peixe: " + Arrays.toString(this.tiposPeixe));
        System.out.println("Pesca diária:" + this.calculaPescaDiaria() + " peixes");
        System.out.println("Pesca mensal: " + this.calculaPescaMensal() + " peixes");
        System.out.println("Data e Hora de Criação: " + this.dataHoraCriacao);
        System.out.println("============");

    }
}
