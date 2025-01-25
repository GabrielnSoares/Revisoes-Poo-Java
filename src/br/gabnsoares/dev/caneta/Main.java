package br.gabnsoares.dev.caneta;

public class Main {
    public static void main(String[] args) {

        Caneta canetaAzul = new Caneta();
        canetaAzul.cor = "Azul";
        canetaAzul.carga = 100;
        canetaAzul.marca = "BIC";
        canetaAzul.ponta = 0.5;
        canetaAzul.tampar();

        Caneta canetaVermelha = new Caneta();
        canetaVermelha.cor = "Vermelho";
        canetaVermelha.carga = 100;
        canetaVermelha.ponta = 0.5;
        canetaVermelha.marca = "Faber-Casttel";
        canetaVermelha.tampar();
        canetaVermelha.destampar();

        canetaAzul.escrever("ola da caneta azul");
        canetaVermelha.escrever("ola da caneta vermelha");

        canetaAzul.status();
        canetaVermelha.status();
    }
}