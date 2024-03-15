package org.example;

import net.datafaker.Faker;

public class Palabra {
    private String adivinar;
    private String categoria;

    public Palabra() {
        categoria = "pokemon";
        adivinar = new Faker().pokemon().name();
    }

    public Palabra(String adivinar, String categoria) {
        this.adivinar = adivinar;
        this.categoria = categoria;
    }


    public String getAdivinar() {
        return adivinar;
    }

    public void setAdivinar(String adivinar) {
        this.adivinar = adivinar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "adivinar='" + adivinar + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
