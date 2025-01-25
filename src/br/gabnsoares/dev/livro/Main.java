package br.gabnsoares.dev.livro;

public class Main {

    public static void main(String[] args) {

        Livro hobbit = new Livro("The hobbit", "Tolkien", 1937);
        hobbit.setTitulo("The hobbit");
        hobbit.setAutor("Tolkien");
        hobbit.setAnoPublicado(1937);

        hobbit.status();


    }
}
