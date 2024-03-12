package dao;


import common.Categoria;
import common.CategoriaException;
import domain.Palabra;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Palabras {
    private final ArrayList<Palabra> Palabras;
    private static int autonumerico;

    public Palabras() {
        this.Palabras = new ArrayList<>();

        try {
            Palabras.add(new Palabra(autonumerico++, 1, "El mejor verano de mi vida", Categoria.comedia.name()));
            Palabras.add(new Palabra(autonumerico++, 1, "Misión Imposible IV fallout", Categoria.accion.name()));

            Faker faker = new Faker();
            String nombre = faker.gameOfThrones().character();
            for (int i = 0; i < 10; i++) {
                Palabras.add(new Palabra(autonumerico++, 2, faker.pokemon().name(), Categoria.pokemon.name()));
            }
        } catch (CategoriaException e) {
            System.out.println(e.getMessage());
        }

    }

    public Palabras(ArrayList<Palabra> Palabras) {
        this.Palabras = Palabras;
    }

    public static void setAutonumerico(int i) {
        autonumerico = i;
    }

    public List<Palabra> getListaPalabras() {
        return Palabras;
    }

    public static int getAutonumerico() {
        return autonumerico;
    }

    public void setListaPalabras(List<Palabra> Palabras) {
        this.Palabras.clear();
        this.Palabras.addAll(Palabras);
    }
}

