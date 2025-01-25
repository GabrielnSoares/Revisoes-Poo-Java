package br.gabnsoares.dev.sistemabancario;

public class ContaCorrente {

    private final String cpf;
    private final String nomeCompleto;
    private double saldo;

    public ContaCorrente(String cpf, String nomeCompleto) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.saldo = 0;
    }
    public void sacar(double valor) {
        this.saldo -= valor;

    }
    public void depositar(double valor) {
        this.saldo += valor;

    }
    public void transferir(double valor, ContaCorrente ccDestino) {
        sacar(valor);
        ccDestino.depositar(valor);
        System.out.println("Transferência realizada de " + this.nomeCompleto + " para " + ccDestino.getNomeCompleto() +
                           "CPF: " + ccDestino.getCpf() + "no valor de R$" + valor);

    }
    @SuppressWarnings("UnusedReturnValue")
    public double verSaldo() {
        System.out.println("Saldo da conta do " + this.nomeCompleto + " eh: R$" + this.saldo);
        return saldo;
    }

    public String getNomeCompleto () {
        return this.nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }
}
