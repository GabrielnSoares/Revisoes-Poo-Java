package br.gabnsoares.dev.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Hello World");
        System.out.println(caixaDeTexto.pegar());

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardar(7);
        System.out.println(caixaDeNumero.pegar());

        List<String> listaDeTarefas = new ArrayList<>();
        listaDeTarefas.add("Primeira tarefa");
        listaDeTarefas.add("Segunda tarefa");
        System.out.println(listaDeTarefas);

    }
}
