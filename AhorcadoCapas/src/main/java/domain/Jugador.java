package domain;

import java.io.Serializable;

public class Jugador implements Serializable {
    //opcional nombre,
    protected String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
