package ADO;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Articulo implements Serializable {
    // atributos de clase
    private static float preciobase = 1;

    // atributos miembro
    private String codArt;
    private String nombre;
    private String fecha;
    private int anyo;
    private String resumen;
    private Autor autor;
    private boolean deteriorado;
    private ArrayList<String> comentarios = new ArrayList();

    public Articulo(String cod, String nombre, String fecha, int anyo, 
                    String resumen, Autor autor, boolean deteriorado) {
        this.codArt = cod;
        this.nombre = nombre;
        this.fecha = fecha;
        this.anyo = anyo;
        this.resumen = resumen;
        this.autor = autor;
        this.deteriorado = deteriorado;
    }

    public static float getPreciobase() {
        return preciobase;
    }

    public String getCodArt() {
        return codArt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDeteriorado() {
        return deteriorado;
    }

    public void setDeteriorado(boolean deteriorado) {
        this.deteriorado = deteriorado;
    }

    public ArrayList <String> getComentarios() {
        return comentarios;
    }
        
    public abstract String info();

    public abstract float precioAlquilerArticulo(int dias);
    
    public abstract boolean guardaComentario(String c);

}
