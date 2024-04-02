package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how

        Palabras misPalabras = new Palabras();
        Palabra [] lista = misPalabras.damePalabrasCategoria("categoria0");
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
        }
    }
