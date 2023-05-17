
package ADO;


public abstract class Libro extends Articulo {
    // atributos miembro
    protected int numPaginas;

    public Libro(int numPaginas, String cod, String nombre, String fecha, 
            int anyo, String resumen, String autor, boolean deteriorado) {
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
