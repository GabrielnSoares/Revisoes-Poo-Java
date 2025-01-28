package br.gabnsoares.dev.estadio;

public class JogadorFutebol extends Jogador {

    private final String peDominante;
    private int totalGols;

    public JogadorFutebol(String nome, int numero, String peDominante, int totalGols) {
        super(nome, numero);
        this.peDominante = peDominante;
        this.totalGols = totalGols;
    }

    public void driblar() {
        System.out.println("Driblando!");
    }

    public void fazerGol() {
        this.totalGols++;
    }

    @Override
    public String toString() {
        return "JogadorFutebol{" +
               "peDominante='" + peDominante + '\'' +
               ", totalGols=" + totalGols +
               ", nome='" + nome + '\'' +
               ", numero=" + numero +
               '}';
    }
}
