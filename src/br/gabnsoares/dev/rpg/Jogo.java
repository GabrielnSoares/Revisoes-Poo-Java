package br.gabnsoares.dev.rpg;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. mostrar menu de herois disponiveis
        Heroi guerreiro = criarGuerreiro();
        Heroi mago = criarMago();
        Heroi arqueiro = criarArqueiro();

        mostrarApresentacoes(guerreiro, mago, arqueiro);

        // 2. usuario seleciona heroi
        int menuOpcaoEscolhida = sc.nextInt();
        Heroi heroiSelecionado = selecionarHeroi(menuOpcaoEscolhida, guerreiro, mago, arqueiro);

        // 3. mostrar o monstro
        Monstro dragao = criarDragao();
        dragao.mostrarApresentacao();

        // 4. comecar turnos de combate ((loop))
        boolean jogoAcabou = false;
        do {

            // 4.1 solicitar acao do turno do heroi
            realizarTurnoHeroi(sc, heroiSelecionado, dragao);
//noinspection ConstantConditions
            jogoAcabou = verificarFimJogo(dragao, heroiSelecionado, jogoAcabou);

            // 4.2 mostrar vidas
            mostrarVida(heroiSelecionado, dragao);

            // 4.3 executar o turno do monstro
            realizarTurnoMonstro(dragao, heroiSelecionado);

            // 4.4 mostrar as vidas
            mostrarVida(heroiSelecionado, dragao);

            // 4.5 verificar as vidas e finalizar o jogo se for caso
            // caso os personagens tenham vida, voltar para o 4.1

            jogoAcabou = verificarFimJogo(dragao, heroiSelecionado, jogoAcabou);

        } while (!jogoAcabou);
    }

    private static Monstro criarDragao() {
        return new Monstro("Dragão", 100, 15, 5, 2,
                "Cuspir fogo!", 0.2);
    }

    private static Heroi criarArqueiro() {
        return new Heroi("Arqueiro", 90, 18, 8, "Estrategista",
                3, 1, "Feclhas congelantes!"
        );
    }

    private static Heroi criarMago() {
        return new Heroi("Mago", 80, 25, 10, "Feiticeiro",
                1, 2, "Bola de fogo!"
        );
    }

    private static Heroi criarGuerreiro() {
        return new Heroi("Guerreiro", 100, 20, 5, "Ataque",
                1, 1, "Espadada flamejante!"
        );
    }

    private static boolean verificarFimJogo(Monstro dragao, Heroi heroiSelecionado, boolean jogoAcabou) {
        if (dragao.estaMorto()) {
            jogoAcabou = true;
            System.out.println("Você eliminou o Dragão! Parabénsss!!");
        }
        if (heroiSelecionado.estaMorto()) {
            jogoAcabou = true;
            System.out.println("Você morreu");
        }
        return jogoAcabou;
    }

    private static void realizarTurnoMonstro(Monstro dragao, Heroi heroiSelecionado) {
        System.out.println("## TURNO DO DRAGAO ##");
        dragao.regenerarVida();
        dragao.atacar(heroiSelecionado);
    }

    private static void mostrarVida(Heroi heroiSelecionado, Monstro dragao) {
        System.out.println(" ");
        heroiSelecionado.mostrarVida();
        dragao.mostrarVida();
        System.out.println(" ");
    }

    private static void realizarTurnoHeroi(Scanner sc, Heroi heroiSelecionado, Monstro dragao) {
        System.out.println("\n ## SEU TURNO ##");
        System.out.println("1. Atacar / 2. Usar habilidade especial / 3. Beber poção de vida");
        int opcaoJogada = sc.nextInt();

        switch (opcaoJogada) {
            case 1:
                heroiSelecionado.atacar(dragao);
                break;
            case 2:
                heroiSelecionado.usarAtaqueEspecial(dragao);
                break;
            case 3:
                heroiSelecionado.usarPocaoVida();
                break;
        }
    }

    private static Heroi selecionarHeroi(int menuOpcaoEscolhida,
                                         Heroi guerreiro,
                                         Heroi mago,
                                         Heroi arqueiro) {

        return switch (menuOpcaoEscolhida) {
            case 1 -> guerreiro;
            case 2 -> mago;
            case 3 -> arqueiro;
            default -> null;
        };

    }

    private static void mostrarApresentacoes(Heroi guerreiro, Heroi mago, Heroi arqueiro) {
        System.out.println("Heróis disponíveis: ");
        System.out.print("1 - ");
        guerreiro.mostrarApresentacao();

        System.out.print("2 - ");
        mago.mostrarApresentacao();

        System.out.print("3 - ");
        arqueiro.mostrarApresentacao();

        System.out.println("Escolha o seu heroi: ");
    }
}
