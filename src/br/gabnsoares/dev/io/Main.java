package br.gabnsoares.dev.io;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        writeFile();

        readFile();


    }

    private static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(ArquivoConfig.PATH + "\\exemplo.txt"))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile() {
        // try with resources
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ArquivoConfig.PATH + "\\exemplo.txt"))) {

            bw.write("ola mundo");
            bw.newLine();
            bw.write("ola mundo segunda linha");
            bw.newLine();
            bw.newLine();
            bw.write("rodape");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
