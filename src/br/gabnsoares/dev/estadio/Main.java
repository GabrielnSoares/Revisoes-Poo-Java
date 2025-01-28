package br.gabnsoares.dev.estadio;

public class Main {

    public static void main(String[] args) {

        JogadorFutebol gabriel = new JogadorFutebol("Gabriel", 9, "Direito", 20);
        JogadorFutebolAmericano tomBrady = new JogadorFutebolAmericano(
                "Tom Brady",
                12,
                "arquivo com lista de jogadas",
                350
        );
        JogadorBasquete michaeJordan = new JogadorBasquete(
                "Michael Jordan",
                99,
                2,
                500
        );

        gabriel.driblar();
        gabriel.fazerGol();

        System.out.println(gabriel);

        tomBrady.correrJardas(100);
        tomBrady.fazerTouchDown();
        tomBrady.bloquear();

        System.out.println(tomBrady);

        michaeJordan.arremessar();
        michaeJordan.fazerEnterrada();
        michaeJordan.treinar();

        System.out.println(michaeJordan);

    }
}
