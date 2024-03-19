package ui;

import common.Constantes;
import net.datafaker.providers.entertainment.SouthPark;
import service.GestionPalabras;
import service.IGestionPalabras;

import java.util.Scanner;

/**
 * Clase con métodos de administración para consola
 */
public class GestionArranque {

    private final IGestionPalabras servicio;
    private static final String pass = "2223";

    public GestionArranque(){
        servicio = new GestionPalabras();
    }

    public static int mostrarMenu(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.MENU+"\n"+Constantes.OPCION1+"\n"+Constantes.OPCION2+"\n"+Constantes.OPCION3+"\n"+Constantes.OPCION4);
        int num = lector.nextInt(); //tratar la excepción para evitar que se pare el programa si no introduce un número
        return num;
    }
    public void opciones(int opcion){
        switch(opcion){
            case 1:
                System.out.println(servicio.getListaPalabras());

        }
    }
    public void opciones(){
        int opcion = mostrarMenu();
        switch(opcion){
            case 0:
                System.out.println(servicio.escribirFichero());
            case 1:
                System.out.println(servicio.getListaPalabras());
            case 4:
                System.out.println(servicio.eliminarPalabra(2));
        }
    }

    public void mostrarMenuArranque(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.MENU+"\n"+Constantes.OPCION1+"\n"+Constantes.OPCION2+"\n"+Constantes.OPCION3+"\n"+Constantes.OPCION4);
        int num = lector.nextInt(); //tratar la excepción para evitar que se pare el programa si no introduce un número
        opciones(num);
    }

}
