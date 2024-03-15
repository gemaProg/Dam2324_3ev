package org.example;

import net.datafaker.Faker;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
      public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(10);
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        ArrayList<String> listaNombres = new ArrayList();
        listaNombres.add("Pepe");
        listaNombres.add("Juan");
        for (int i = 0; i < 10; i++) {
            listaNombres.add(new Faker().chiquito().jokes());
        }
        System.out.println(lista.size());
        System.out.println(listaNombres);

        ArrayList<Palabra> listaPalabras = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaPalabras.add(new Palabra());
        }
        String adivinar = listaPalabras.get((int)(Math.random()*listaPalabras.size())).getAdivinar();
        for (int i = 0; i < adivinar.length() ; i++) {
            System.out.print("_");
        }
    }

}