/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example;

import java.util.*;

/**
 *
 * @author gema
 */
public class ListSetEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> lista = new ArrayList();
        lista.add("Marina");
        lista.add("Alvaro");
        lista.add("Rey");
        lista.add("Sonia");
        lista.add("Ivan");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("----------------TreeSet------------------------------------");
        TreeSet<String> conjuntoO = new TreeSet();
        conjuntoO.add("Mario");
        conjuntoO.add("Jorge");
        conjuntoO.add("Maksim");
        conjuntoO.add("Marcos");
        conjuntoO.add("Marcos");
        conjuntoO.add("Marcos");
        conjuntoO.add("Marcos");
        conjuntoO.add("Marcos");
        conjuntoO.add("Ivan");
        ArrayList<String> listaTree = new ArrayList(conjuntoO);
        Iterator<String> it = conjuntoO.iterator();
        while(it.hasNext()){
            String aux = it.next();
            System.out.println(aux.toUpperCase());
        }


       for (int i = 0; i < listaTree.size(); i++) {
            System.out.println(listaTree.get(i));
        }
        System.out.println(conjuntoO.size());
        System.out.println("----------------------------HashSet----------------------------------");
        HashSet<String> conjunto = new HashSet();
        conjunto.add("Mario");
        conjunto.add("Jorge");
        conjunto.add("Maksim");
        conjunto.add("Marcos");
        conjunto.add("Marcos");
        conjunto.add("Marcos");
        conjunto.add("Marcos");
        conjunto.add("Marcos");
        conjunto.add("Ivan");
        Iterator<String> itH = conjunto.iterator();
        while(itH.hasNext()){
            System.out.println(itH.next());
        }
        System.out.println(conjunto.size());

        TreeSet<Palabra> ts = new TreeSet(); //compareTo
        ts.add(new Palabra(1,4,"comida","arroz"));
        ts.add(new Palabra(2,4,"comida","patatas"));
        System.out.println(ts.add(new Palabra(3,2,"comida","hamburguesa")));
        ts.add(new Palabra(4,3,"comida","pollo"));
        ts.add(new Palabra(5,1,"comida","pizza"));
        System.out.println(ts); //toString de Object
        ArrayList<Palabra> al = new ArrayList(ts);
        Collections.sort(al, new porNivel());
        System.out.println(al);
        
        TreeSet<Palabra> ts1 = new TreeSet(new porNivel()); // compare (comparator)
        ts1.add(new Palabra(1,1,"comida","arroz"));
        ts1.add(new Palabra(2,2,"comida","patatas"));
        System.out.println(ts.add(new Palabra(3,2,"comida","arroz")));
        ts1.add(new Palabra(4,3,"comida","pollo"));
        ts1.add(new Palabra(5,3,"comida","pizza"));
        System.out.println(ts1); //toString de Object*/

        HashSet<Palabra> hs = new HashSet(); //equals
        hs.add(new Palabra(1,1,"comida","arroz"));
        hs.add(new Palabra(2,1,"comida","patatas"));
        hs.add(new Palabra(2,1,"comida","hamburguesa"));
        hs.add(new Palabra(3,1,"comida","pollo"));
        hs.add(new Palabra(4,1,"comida","pizza"));
        System.out.println(hs);
    }

}
