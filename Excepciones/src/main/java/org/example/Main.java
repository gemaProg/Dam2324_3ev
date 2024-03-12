package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*try {
            int lista[] = new int[10];
            System.out.println(lista[lista.length]);
        }catch (ArrayIndexOutOfBoundsException excepcion){
            System.out.println(excepcion.getMessage());
            System.out.println(excepcion.getCause());
            System.out.println(excepcion.getClass().getSimpleName());

        }
        System.out.println("asdf");
        */
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un  número entre 1 y 5");
        boolean letra;
        do{
            try {
                int num = lector.nextInt();
                letra = false;
            }catch (InputMismatchException in){
                letra = true;
                System.out.println("sólo números");
                lector.nextLine();
            }
        }while(letra);
        System.out.println("sigo en ejecución");
        /*
        try {
            char letra = (char)System.in.read();
        } catch (IOException e) {
            System.out.println("Error de E/S");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        */
    }
}