package ui;


import common.Categoria;
import common.CategoriaException;
import common.Comprobacion;
import dao.DaoPalabrasFicheros;
import domain.Juego;
import domain.Jugador;
import domain.Palabra;
import net.datafaker.Faker;
import net.datafaker.providers.entertainment.SouthPark;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //En el main sólo hay que llamar a los métodos de la UI que darán paso al luego o administrar diccionario.


        //Este código no va aquí, pero es para que veáis cómo funciona ciertos aspectos de la aplicación a tener en cuenta
        /*0GestionDiccionario.mostrarMenu();
        try {
            Comprobacion.categoriaOk(Categoria.comedia.name());
            Comprobacion.categoriaOk("hola");
        }catch (CategoriaException e){
            System.out.println(e.getMessage());
        }


        Faker faker = new Faker();
        String nombre = faker.gameOfThrones().character();
        System.out.println(nombre);
        String animal = faker.animal().name();
        System.out.println(animal);
        String fecha = faker.date().birthday(10,15).toString();
        System.out.println(fecha);



        //El siguiente código no va aquí pero es para que sepáis cómo funciona el id autonumérico
        /*Palabras asdf = new Palabras();
        System.out.println(Palabras.getAutonumerico());
        Palabra asd = new Palabra(2,"324",Categoria.accion.name());
        System.out.println(Palabras.getAutonumerico());
        Palabra asd2 = new Palabra(2,"324",Categoria.miedo.name());
        System.out.println(Palabras.getAutonumerico());*/
        Juego juego = null;
        if (!(new File(DaoPalabrasFicheros.FICHEROB).exists())) {
            try {
                juego = new Juego(new Palabra(1, 1, new Faker().programmingLanguage().name(), "LenguajesProgramación"), new Jugador("Gema"), 3, 4);
            } catch (CategoriaException e) {
                throw new RuntimeException(e);
            }
            juego.jugando();
            System.out.println(juego);
        }
        else {
            juego = DaoPalabrasFicheros.leerFicheroBinarioRecuperarPartida();
            System.out.println(juego);
        }
        if (!(new File(DaoPalabrasFicheros.FICHEROB).exists()))
            DaoPalabrasFicheros.escribirFicheroBinarioGuardarPartida(juego);

    }
}