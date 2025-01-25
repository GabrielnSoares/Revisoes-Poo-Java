package br.gabnsoares.dev.enums;

public enum NivelAcesso {

    ADMIN("Administrador do Sistema"),
    CONVIDADO("Convidado do Sistema"),
    USUARIO("Usuario do Sistema");

    private final String descricao;

    NivelAcesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
