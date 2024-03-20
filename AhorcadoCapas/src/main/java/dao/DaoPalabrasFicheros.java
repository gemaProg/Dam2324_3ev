package dao;

import common.CategoriaException;
import domain.Palabra;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaoPalabrasFicheros {
    public static final String FICHERO = "Fichero";
    public static final String FICHEROB = "FicheroBinario";

    public static void crearFicheros() throws IOException {
        File fichero1 = new File(FICHERO);
        File fichero2 = new File(FICHEROB);
        if (!fichero1.exists())
            fichero1.createNewFile();
        if (!fichero2.exists())
            fichero2.createNewFile();
    }

    public static void crearFicheros(String nombreFichero) throws IOException {
        File fichero1 = new File(nombreFichero);
        if (!fichero1.exists())
            fichero1.createNewFile();
    }

    public static List<Palabra> leerFichero() throws IOException {
        return leerFichero(DaoPalabrasFicheros.FICHERO);
    }

    public static List<Palabra> leerFichero(String fichero) throws IOException {
        crearFicheros();
        ArrayList<Palabra> auxiliar = null;
        try (Scanner sc = new Scanner(new File(fichero))) {
            auxiliar = new ArrayList<>();
            while (sc.hasNextLine()) {
                String cadena = sc.nextLine();
                String[] trozos = cadena.split(";");
                try {
                    //auxiliar.add(new Palabra(Integer.parseInt(trozos[0]),Integer.parseInt(trozos[1]),trozos[2],trozos[3]));
                    auxiliar.add(new Palabra(cadena));
                } catch (CategoriaException e) {
                    System.out.println(e.getMessage());
                }
            }
            ;
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(DaoPalabrasFicheros.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);

        }

        return auxiliar;

    }

    public static List<Palabra> leerFicheroBufferedReader(String fichero) throws IOException {
        ArrayList<Palabra> auxiliar = null;
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        auxiliar = new ArrayList<>();
        String cadena;
        do {
            cadena = br.readLine();
            if (cadena != null) {
                String[] trozos = cadena.split(";");
                try {
                    //auxiliar.add(new Palabra(Integer.parseInt(trozos[0]),Integer.parseInt(trozos[1]),trozos[2],trozos[3]));
                    auxiliar.add(new Palabra(cadena));
                } catch (CategoriaException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (cadena != null);
    return auxiliar;
}

    public static boolean escribirFichero(List<Palabra> lista, String nombreFichero) throws FileNotFoundException {
        String cadena = null;
        PrintWriter pw = new PrintWriter(nombreFichero);
        //? si no está vacía
        for (int i = 0; i < lista.size(); i++) {
            pw.println(lista.get(i).toStringFichero());
        }
        pw.close();
        return true;
    }

    public static void escribirFicheroConsola(String nombreFichero) throws FileNotFoundException {
        Scanner lector = new Scanner(System.in);
        String cadena = null;
        PrintWriter pw = new PrintWriter(nombreFichero);
        System.out.println("Introduce las líneas que quieras escribir en el fichero, para acabar pon FIN");
        do {
            cadena = lector.nextLine();
            if (!cadena.equalsIgnoreCase("fin"))
                pw.println(cadena);
        } while (!cadena.equalsIgnoreCase("fin"));
        pw.close();
    }

    public static void LeerFichero(String nombreFichero) throws FileNotFoundException {
        Scanner lector = new Scanner(new File(nombreFichero));
        String cadena;
        while (lector.hasNextLine()) {
            System.out.println(lector.nextLine());
        }
        System.out.println("Se ha alcanzado el final del fichero");
    }

    public static void escribirFicheroConsolaNoSobreescribir(String nombreFichero) throws IOException {
        Scanner lector = new Scanner(System.in);
        String cadena = null;
        /*FileWriter fw = new FileWriter(nombreFichero,true);
        PrintWriter pw1 = new PrintWriter(fw);*/
        PrintWriter pw = new PrintWriter(new FileWriter(nombreFichero, true));

        System.out.println("Introduce las líneas que quieras escribir en el fichero, para acabar pon FIN");
        do {
            cadena = lector.nextLine();
            if (!cadena.equalsIgnoreCase("fin"))
                pw.println(cadena);
        } while (!cadena.equalsIgnoreCase("fin"));
        pw.close();
    }

    /**
     * Ejemplo de lectura de fichero binario. Pensad cómo utilizarlo para guardar y recuperar partida, guardando el objeto juego
     * en vez del ArrayList
     *
     * @return
     */
    public static List<Palabra> leerFicheroBinario() {
        List<Palabra> auxiliar = null;
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FICHEROB))) {
            auxiliar = (List<Palabra>) is.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DaoPalabrasFicheros.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);

        }
        return auxiliar;
    }


    public static boolean escribirFicheroBinario(List<Palabra> Palabras) {
        boolean escrito = false;
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FICHEROB))) {
            os.writeObject(Palabras);
            escrito = true;
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(DaoPalabrasFicheros.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        }
        return escrito;
    }


}
