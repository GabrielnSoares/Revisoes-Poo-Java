package br.gabnsoares.dev.exceptions;

public class Main {

    public static void main(String[] args) throws MinhaCheckedException {

        lancarExcecao();

        throw new MinhaCheckedException("Erro generico");

    }

   private static void lancarExcecao() {
       throw new MinhahUncheckedException("Erro de teste que aparece  no stacktrace");
    }
}
