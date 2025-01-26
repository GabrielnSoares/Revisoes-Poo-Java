package br.gabnsoares.dev.pesqueiro;

public class Main {

    public static void main(String[] args) {

        Pesqueiro pesqVille = new Pesqueiro("PesqVille",
                100,
                new String[]{"Pintado", "Pacu", "Dourado", "Tilápia", "Tucunaré"}
        );
        Pesqueiro california = new Pesqueiro("Pesqueiro California",
                50,
                new String[]{"Pirarucu", "Traira", "Cascudo", "Tilapia"}
        );

        california.mostrarInfo();
        pesqVille.mostrarInfo();

    }
}
