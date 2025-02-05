package br.gabnsoares.dev.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> conjutoFrutas =  new HashSet<>();

        conjutoFrutas.add("Banana");
        conjutoFrutas.add("Maçã");
        conjutoFrutas.add("Uva");
        conjutoFrutas.add("Abacaxi");

        System.out.println(conjutoFrutas);
        System.out.println(conjutoFrutas.isEmpty());

        // verifica se o item está no conjunto
        System.out.println(conjutoFrutas.contains("Abacaxi"));

        conjutoFrutas.remove("Banana");
        System.out.println(conjutoFrutas);

        System.out.println(conjutoFrutas.hashCode());

        System.out.println(conjutoFrutas.iterator());
    }
}
