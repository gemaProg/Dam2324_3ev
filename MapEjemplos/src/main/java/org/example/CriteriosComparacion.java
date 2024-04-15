/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.Comparator;

/**
 *
 * @author gema
 */
public class CriteriosComparacion {
    
}
class porLongitud implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}

class porLongitudAlfabeticoReves implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        int resultado = Integer.compare(o1.length(),o2.length());
        if (resultado==0)
            resultado = o2.compareTo(o1);
        return resultado;
    }

}