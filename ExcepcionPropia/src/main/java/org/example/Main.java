package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //gestionar mediante una excepcion propia que la opción introducida para un menú esté entre 1 y 10
        Scanner teclado = new Scanner(System.in);
        boolean queso = false;

        /*System.out.println("Introduce un número entre 1 y 10");
        try {
            Comprobaciones.comprobarRango(teclado.nextInt());
        } catch (miExcepcion e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hasta luego");*/
        do{
            try {
                System.out.println("Introduce un número entre 1 y 10");
                Comprobaciones.comprobarRango(teclado.nextInt());
                queso = true;
            } catch (miExcepcion e) {
                System.out.println(e.getMessage());
                teclado.nextLine();
            }
        }while(!queso);

    }
}