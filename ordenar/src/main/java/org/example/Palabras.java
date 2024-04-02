package org.example;

public class Palabras {
    private Palabra lista [];

    public Palabras(){
        lista = new Palabra[10];
        for (int i = 0; i < 5; i++) {
            lista[i] = new Palabra();
        }
    }
    private int cuantosCategoria(String categoria){
        int contador=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]!=null && lista[i].getCategoria().equals(categoria)){
                contador++;
            }
        }
        return contador;
    }
    public Palabra[] damePalabrasCategoria(String categoria){
        Palabra[] aux= new Palabra[cuantosCategoria(categoria)];
        for (int i = 0, j=0; i < lista.length; i++) {
            if (lista[i]!=null && lista[i].getCategoria().equals(categoria)){
                aux[j]=lista[i];
                j++;
            }
        }
        return aux;
    }


}
