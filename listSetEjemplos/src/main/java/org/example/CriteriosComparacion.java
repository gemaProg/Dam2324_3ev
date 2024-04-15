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
class porNivel implements Comparator<Palabra>{

    @Override
    public int compare(Palabra o1, Palabra o2) {
        return Integer.compare(o1.getNivel(),o2.getNivel());
    }



}
