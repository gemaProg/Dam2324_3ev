package org.example;

public class Comprobaciones {
    public static void comprobarRango(int numero) throws miExcepcion {
        if (numero<1 || numero>10)
            //throw new miExcepcion(String.format("%d",numero));
            //throw new miExcepcion(String.valueOf(numero));
            throw new miExcepcion();
    }
}
