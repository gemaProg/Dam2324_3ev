package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int lista[] = new int [10];
        System.out.println(lista[lista.length]);

        Scanner lector = new Scanner(System.in);
        System.out.println(lector.nextInt());

        char letra = (char)System.in.read();

    }
}