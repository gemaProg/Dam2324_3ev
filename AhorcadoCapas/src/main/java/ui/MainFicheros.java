package ui;

import dao.DaoPalabrasFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFicheros {
    public static void main(String[] args) {
        try {
            //DaoPalabrasFicheros.crearFicheros("Juan");
            DaoPalabrasFicheros.escribirFicheroConsolaNoSobreescribir("perry");
            DaoPalabrasFicheros.LeerFichero("perry");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }catch (IOException e) {
            System.out.println("error de E/S");
        }
    }
}
