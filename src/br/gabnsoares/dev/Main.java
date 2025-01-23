package br.gabnsoares.dev;

public class Main {
    public static void main(String[] args) {

        Caneta canetaAzul = new Caneta();
        canetaAzul.cor = "Azul";
        canetaAzul.tampada = false;
        canetaAzul.carga = 100;
        canetaAzul.marca = "BIC";
        canetaAzul.ponta = 0.5;

        Caneta canetaVermelha = new Caneta();
        canetaVermelha.cor = "Vermelho";
        canetaVermelha.tampada = false;
        canetaVermelha.carga = 100;
        canetaVermelha.ponta = 0.5;
        canetaVermelha.marca = "Faber-Casttel";

        canetaVermelha.tampar();
        canetaAzul.tampar();

        System.out.println("Caneta azul criada: " +
                           "Cor: " + canetaAzul.cor + " Tampada: " + canetaAzul.tampada);
        System.out.println("Caneta vermelha criada: " +
                           "Cor: " + canetaVermelha.cor + " Tampada: " + canetaVermelha.tampada);

        System.out.println("------------");
        canetaVermelha.destampar();
        canetaAzul.destampar();

        System.out.println("Caneta azul criada: " +
                           "Cor: " + canetaAzul.cor + " Tampada: " + canetaAzul.tampada);
        System.out.println("Caneta vermelha criada: " +
                           "Cor: " + canetaVermelha.cor + " Tampada: " + canetaVermelha.tampada);        canetaVermelha.tampar();
        canetaAzul.tampar();

        System.out.println("Caneta azul criada: " +
                           "Cor: " + canetaAzul.cor + " Tampada: " + canetaAzul.tampada);
        System.out.println("Caneta vermelha criada: " +
                           "Cor: " + canetaVermelha.cor + " Tampada: " + canetaVermelha.tampada);

        System.out.println("-------------");
        canetaVermelha.destampar();
        canetaAzul.destampar();

        System.out.println("Caneta azul criada: " +
                           "Cor: " + canetaAzul.cor + " Tampada: " + canetaAzul.tampada);
        System.out.println("Caneta vermelha criada: " +
                           "Cor: " + canetaVermelha.cor + " Tampada: " + canetaVermelha.tampada);

        canetaAzul.escrever("ola da caneta azul");
        canetaVermelha.escrever("ola da caneta vermelha");
    }
}