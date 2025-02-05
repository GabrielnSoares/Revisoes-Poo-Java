package br.gabnsoares.dev.map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {

        Map<String, String> mapaFrutas = new HashMap<>();

        mapaFrutas.put("A", "Abacaxi");
        mapaFrutas.put("B", "Banana");
        mapaFrutas.put("U", "Uva");
        mapaFrutas.put("L", "Limão");
        mapaFrutas.put("G", "Goiaba");

        System.out.println(mapaFrutas);

        // buscando dentro do mapa
        System.out.println(mapaFrutas.get("U"));

        mapaFrutas.remove("B");
        System.out.println(mapaFrutas);

        System.out.println(mapaFrutas.isEmpty());

        // listar todos os valores do map
        System.out.println(mapaFrutas.values());

        // quantidade de itens no map
        System.out.println(mapaFrutas.size());

        System.out.println(mapaFrutas.entrySet());


    }
}
