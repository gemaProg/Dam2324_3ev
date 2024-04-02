package dao;


import common.Categoria;
import common.CategoriaException;
import domain.Palabra;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Palabras {
    private final List<Palabra> palabras;
    private static int autonumerico;

    public Palabras()  {
        //Aquí leer fichero cuando ya esté el fichero creado con las palabras del DataFaker
        this.palabras = new ArrayList<>();

        HashSet<Palabra> hs = new HashSet<>();
        try {
            hs.add(new Palabra(autonumerico++, 1, "El mejor verano de mi vida", Categoria.comedia.name()));
            hs.add(new Palabra(autonumerico++, 1, "Misión Imposible IV fallout", Categoria.accion.name()));

            Faker faker = new Faker();
            String nombre = faker.gameOfThrones().character();
            for (int i = 0; i < 100; ) {
                 if (hs.add(new Palabra(autonumerico++, 2, faker.pokemon().name(), Categoria.pokemon.name())))
                     i++;
            }
        } catch (CategoriaException e) {
            System.out.println(e.getMessage());
        }

    }

    public Palabras(ArrayList<Palabra> Palabras) {
        this.palabras = Palabras;
    }

    public static void setAutonumerico(int i) {
        autonumerico = i;
    }

    public List<Palabra> getListaPalabras() {
        return palabras;
    }

    public static int getAutonumerico() {
        return autonumerico;
    }

    public void setListaPalabras(List<Palabra> Palabras) {
        this.palabras.clear();
        this.palabras.addAll(Palabras);
    }

    public boolean eliminaPalabra(int i) {
        //i posicion
        //palabras.remove(i);
        //i -> id
        boolean salir = false;
        for (int j = 0; j < palabras.size() && !salir; j++) {
            if (palabras.get(j).getId()==i) {
                palabras.remove(j);
                salir = true;
            }
        }
        return salir;
    }

}

