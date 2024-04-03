package domain;

import java.io.Serializable;
import java.util.Arrays;

public class Juego implements Serializable {
    //pensar en los atributos que definen el estado del juego en ese instante para que que si lo paran se pueda recuperar
    private Palabra aAdivinar; //o el String directamente
    private Jugador jugador;
    private int intentos;
    private int dificultad; //opcional, aquí o por elemento.
    private char[] incognita;

    public Juego(Palabra aAdivinar, Jugador jugador, int intentos, int dificultad) {
        this.aAdivinar = aAdivinar;
        this.jugador = jugador;
        this.intentos = intentos;
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "aAdivinar=" + aAdivinar +
                ", jugador=" + jugador +
                ", intentos=" + intentos +
                ", dificultad=" + dificultad +
                ", incognita=" + Arrays.toString(incognita) +
                '}';
    }

    public void jugando() {
        incognita = aAdivinar.getIncognita().toCharArray();
        for (int i = 0; i < incognita.length; i++) {
            incognita[i]='-';
        }
        incognita[2]='s';


    }
}
