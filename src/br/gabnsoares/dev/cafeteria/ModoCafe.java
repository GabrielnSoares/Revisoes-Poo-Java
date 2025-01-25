package br.gabnsoares.dev.cafeteria;

public enum ModoCafe {

    EXPRESSO ("Café Expresso"),
    AMERICANO ("Café Americano"),
    PINGADO ("Cadé Pingado");

    private final String descricao;

    ModoCafe(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
