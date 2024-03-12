package domain;


import common.CategoriaException;
import common.Comprobacion;
import dao.Palabras;

public class Palabra {
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
     * @throws CategoriaException arroja esta excepción si la categoría no es una de las establecidas
     */
    public Palabra(int id, int level, String incognita, String categoria) throws CategoriaException {
        this.id = id;
        this.level = level;
        this.incognita = incognita;
        Comprobacion.categoriaOk(categoria);
        this.categoria = categoria;
    }
    public Palabra(int level, String incognita, String categoria) throws CategoriaException {
        this.id = Palabras.getAutonumerico();
        Palabras.setAutonumerico(Palabras.getAutonumerico()+1);
        this.level = level;
        this.incognita = incognita;
        Comprobacion.categoriaOk(categoria);
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws CategoriaException {
        Comprobacion.categoriaOk(categoria);
        this.categoria = categoria;
    }
}
