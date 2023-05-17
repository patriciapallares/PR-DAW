/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class LibroImpreso extends Libro{
    
    private boolean formato;
    private String tapa;
    
    public LibroImpreso(boolean formato, String tapa, int numPaginas, String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado) {
        super(numPaginas, cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.formato = formato;
        this.tapa = tapa;
    }


    @Override
    public String info() {
        String resp = "Libro: " + this.getNombre() + ". Tiene " + this.numPaginas + " páginas.";
        
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio = 0;
        precio = preciobase * dias;
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp = false;
        
        comentarios.add(c);

        resp = true;

        return resp;
    }
    
}
