package org.example;

public class miExcepcion extends Exception{
    public miExcepcion() {
        super("Cuidado. El número debe estar entre 1 y 10");
    }

    public miExcepcion(String message) {
        super(" El número" + message + " no está entre 1 y 10");
    }
}
