package br.gabnsoares.dev.enums;

public class Main {

    public static void main(String[] args) {

        Usuario gabriel = new Usuario("Gabriel",
                NivelAcesso.ADMIN,
                "gab@dev.com.br"
        );
        Usuario maria = new Usuario(
                "Maria",
                NivelAcesso.USUARIO,
                "mariagomes@gmail.com"
        );
        Usuario bruno = new Usuario(
                "Bruno",
                NivelAcesso.CONVIDADO,
                "brunoalcantara@gmail.com"
        );
        gabriel.mostrarInfo();
        maria.mostrarInfo();
        bruno.mostrarInfo();
    }
}
