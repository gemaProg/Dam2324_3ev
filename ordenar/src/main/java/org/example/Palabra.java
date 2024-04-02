package org.example;



public class Palabra implements Comparable<Palabra>{
    private int id;
    private int level;
    private String incognita;
    private String categoria;

    /**
     *
     * @param id identicador único de cada elemento, el String incognita puede tener espacios, mayúsculas, mínúsculas que no lo hagan único
     * @param level indica la dificultad que le asignamos a la incognita a adivinar por el tamaño de caracteres por ejemplo
     * @param incognita palabra a adivinar
     * @param categoria String que debe se un elemento de Categoria, si no lo es se lanzará CategoriaEx y así no se creará el objeto
     */
    public Palabra(int id, int level, String incognita, String categoria)  {
        this.id = id;
        this.level = level;
        this.incognita = incognita;
        this.categoria = categoria;
    }

    public Palabra() {
        this.id = (int)(Math.random()*100);
        this.level = (int)(Math.random()*2);
        this.incognita = "incognita"+id;
        this.categoria = "categoria"+level;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
         this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Palabra{" +
                "id=" + id +
                ", level=" + level +
                ", incognita='" + incognita + '\'' +
                ", categoria='" + categoria + '\'' +
                '}'+ "\n";
    }

    @Override
    public int compareTo(Palabra o) {
       // return Integer.compare(o.id,id);
        return incognita.compareTo(o.incognita);
    }

}
