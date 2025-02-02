package br.gabnsoares.dev.rpg;

public class Monstro extends Personagem {

    public Monstro(String nome, int vida, int ataque, int defesa, int qtdRegeneracaoVida, String nomePoderEspecial, double multiplicadorDanoEspecial) {
        super(nome, vida, ataque, defesa);
        this.qtdRegeneracaoVida = qtdRegeneracaoVida;
        this.nomePoderEspecial = nomePoderEspecial;
        this.multiplicadorDanoEspecial = multiplicadorDanoEspecial;
    }

    private final int qtdRegeneracaoVida;
    private final String nomePoderEspecial;
    private final double multiplicadorDanoEspecial;

    public void regenerarVida() {
        this.vida += qtdRegeneracaoVida;
    }

    @Override
    public void atacar(Personagem alvo) {
        boolean viraAtaqueEspecial = this.executarJogadaEspecial();
        if (viraAtaqueEspecial) {
            this.usarAtaqueEspecial(alvo);
        } else {
            super.atacar(alvo);
        }
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println(this.nome + " "
                           + "(Vida: " + this.vida + ", " +
                           "Ataque: " + this.ataque + ", " +
                           "Defesa: " + this.defesa + ", " +
                           "Regeneração de Vida: " + this.qtdRegeneracaoVida + ", " +
                           "Nome Poder Especial: " + this.nomePoderEspecial + ")"
        );

    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        boolean executarJoadaEspecial = this.executarJogadaEspecial();

        if (executarJoadaEspecial) {
            int danoEspecial = this.ataque + ((int) (this.ataque * this.multiplicadorDanoEspecial));
            alvo.receberDano(danoEspecial);
            System.out.println(this.nome + ": Ataque especial [" + this.nomePoderEspecial + "] realizado!");
        } else {
            System.out.println(this.nome + ": AAAAAAHHHH!!! Você deu sorte!");
        }
    }
}
