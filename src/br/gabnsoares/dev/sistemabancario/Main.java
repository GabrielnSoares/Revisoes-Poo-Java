package br.gabnsoares.dev.sistemabancario;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaGabriel = new ContaCorrente("334343", "Gabriel");
        ContaCorrente contaBruno = new ContaCorrente("45343", "Bruno");

        contaGabriel.depositar(100);
        contaBruno.depositar(20);

        contaGabriel.verSaldo();
        contaBruno.verSaldo();

        contaGabriel.sacar(50);

        contaGabriel.verSaldo();

        contaGabriel.transferir(49.50, contaBruno);
        contaGabriel.verSaldo();
        contaBruno.verSaldo();

    }
}
