package br.gabnsoares.dev.rpg;

public class Heroi extends Personagem {

    final String classe;
    private int qtdAtaqueEspecial;
    private int qtdPocaoVida;
    private final String nomeAtaque;

    public Heroi(String nome, int vida, int ataque, int defesa, String classe, int qtdAtaqueEspecial, int qtdPocaoVida, String nomeAtaque) {
        super(nome, vida, ataque, defesa);
        this.classe = classe;
        this.qtdAtaqueEspecial = qtdAtaqueEspecial;
        this.qtdPocaoVida = qtdPocaoVida;
        this.nomeAtaque = nomeAtaque;
    }

    public void usarPocaoVida() {
        this.vida += 50;
        this.qtdPocaoVida--;
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println(this.nome + " "
                           + "(Vida: " + this.vida + ", " +
                           "Ataque: " + this.ataque + ", " +
                           "Defesa: " + this.defesa + ", " +
                           "Especial: " + this.qtdAtaqueEspecial + ", " +
                           "Poção de Vida: " + this.qtdPocaoVida + ")"
        );

    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        boolean executarJoadaEspecial = this.executarJogadaEspecial();

        if (executarJoadaEspecial && qtdAtaqueEspecial > 0) {
            int danoEspecial = this.qtdAtaqueEspecial + ((int) (this.ataque * 0.1));
            alvo.receberDano(danoEspecial);
            this.qtdAtaqueEspecial--;
            System.out.println(this.nome + ": Ataque especial [" + this.nomeAtaque + "] realizado!");
        } else {
            System.out.println("Arrgg! Ataque especial não realizado!");
        }

    }
}
