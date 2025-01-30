package br.gabnsoares.dev.veiculos;

public class Main {

    public static void main(String[] args) {

        CarroEsportivo carroEsportivo = new CarroEsportivo(
                "BMW",
                2025,
                "Asfalto",
                4,
                "Etanol",
                2,
                100
        );

        Jipe jipe = new Jipe(
                "JEEP",
                2023,
                "Acidentado",
                4,
                "Gasolina",
                4,
                500
        );

        Moto moto = new Moto(
                "SUZUKI",
                2020,
                "Urbano",
                2,
                150
        );
        Helicoptero helicoptero = new Helicoptero(
                "AstonFly",
                2023,
                1000,
                5,
                2
        );
        Aviao aviao = new Aviao(
                "Boeing",
                2015,
                9000,
                12,
                6
        );
        System.out.println("-------------------");
        System.out.println("Carro esportivio");
        carroEsportivo.ligar();
        carroEsportivo.acelerar();
        carroEsportivo.freiar();
        carroEsportivo.desligar();
        carroEsportivo.abrirCapo();
        carroEsportivo.ativarNitro();

        System.out.println("-------------------");
        System.out.println("JIPE");

        jipe.ligar();
        jipe.acelerar();
        jipe.freiar();
        jipe.desligar();
        jipe.abrirCapo();
        jipe.ativarModoOffRoad();

        System.out.println("-------------------");
        System.out.println("MOTO");

        moto.ligar();
        moto.acelerar();
        moto.freiar();
        moto.desligar();
        moto.empinar();

        System.out.println("-------------------");
        System.out.println("HELICOPTERO");

        helicoptero.decolar();
        helicoptero.pousar();
        helicoptero.parar();

        System.out.println("-------------------");
        System.out.println("AVIAO");
        aviao.decolar();
        aviao.pousar();
        aviao.ativarPilotoAutomatico();
    }
}
