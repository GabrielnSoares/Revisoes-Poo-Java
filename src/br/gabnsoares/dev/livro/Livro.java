package br.gabnsoares.dev.livro;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro (String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public void status() {
        System.out.println("============");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano publicado: " + this.anoPublicado);
        System.out.println("============");
    }
}
