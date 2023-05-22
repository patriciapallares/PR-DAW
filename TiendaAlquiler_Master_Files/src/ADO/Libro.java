
package ADO;


public abstract class Libro extends Articulo {
    // atributos miembro
    private int numPaginas;

    // Constructor:
    
    public Libro(int numPaginas, String cod, String nombre, String fecha, 
            int anyo, String resumen, Autor autor, boolean deteriorado) {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.numPaginas = numPaginas;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    
    
}
