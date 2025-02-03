package br.gabnsoares.dev.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> listaFrutas = new ArrayList<>();
// adicionar
        listaFrutas.add("Banana");
        listaFrutas.add("Maçã");
        listaFrutas.add("Uva");
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Maçã");

        System.out.println(listaFrutas);
        System.out.println(listaFrutas.isEmpty());

        // recuperar
        System.out.println(listaFrutas.get(3));
        System.out.println(listaFrutas.getFirst());
        System.out.println(listaFrutas.getLast());

        // remover
        System.out.println(listaFrutas);
        listaFrutas.remove(2);
        System.out.println(listaFrutas);

        // ver tamanho
        System.out.println(listaFrutas.size());

        // limpar itens da lista
        listaFrutas.clear();
        System.out.println(listaFrutas);

        // contem?
        listaFrutas.add("Banana");
        listaFrutas.add("Maçã");
        listaFrutas.add("Uva");
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Maçã");
        System.out.println(listaFrutas.contains("Uva"));

    }
}
