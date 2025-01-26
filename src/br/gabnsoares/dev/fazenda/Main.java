package br.gabnsoares.dev.fazenda;

public class Main {

    public static void main(String[] args) {

        Galinheiro granjaFeliz = new Galinheiro(
                "Granja Feliz",
                50,
                3
        );

        Galinheiro granjaOvosOuro = new Galinheiro(
                "Granja Ovos de Ouro",
                10,
                1
        );
/*/
        System.out.println("Produção diária de ovos");
        System.out.println(granjaFeliz.getNome() + " - " + granjaFeliz.calcularProdDiaria() + " ovos");
        System.out.println(granjaOvosOuro.getNome() + " - " + granjaOvosOuro.calcularProdDiaria() + " ovos");

        System.out.println("-------------------------------");

        System.out.println("Produção mensal de ovos");
        System.out.println(granjaFeliz.getNome() + " - " + granjaFeliz.calcularProdMensal() + " ovos");
        System.out.println(granjaOvosOuro.getNome() + " - " + granjaOvosOuro.calcularProdMensal() + " ovos");*/

        granjaFeliz.mostrarInfo();
        granjaOvosOuro.mostrarInfo();
    }
}
