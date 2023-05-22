/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class LibroImpreso extends Libro{
    // atributos de clase
    private static int numCod = 1;
     
    // atributos
    private boolean formato;
    private String tapa;
    
    public LibroImpreso(boolean formato, String tapa, int numPaginas
            , String nombre, String fecha, int anyo, String resumen, 
            Autor autor, boolean deteriorado) {
        super(numPaginas, "LIM"+numCod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.formato = formato;
        this.tapa = tapa;
        numCod++;
    }
     public boolean isFormato() {
        return formato;
    }

    public void setFormato(boolean formato) {
        this.formato = formato;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    @Override
    public String info() {
        String resp = null;
        resp= "Codigo LibroImpreso:" +this.getCodArt()+"\n"+
              "Nombre=" +getNombre() +"\n"+
              "Año Publicación:" +getAnyo()+"\n"+
              "Resumen: " +getResumen()+"\n"+
              "Autor: " +getAutor().info() +"\n"+
              "¿Esta Deteriorado? : " + isDeteriorado() +"\n"+
              "Numero Paginas: " + getNumPaginas()+"\n"+ 
              "¿Tipo Formato es Papel? : " +isFormato()+"\n"+ 
              "Tipo de Tapa:" +getTapa()+"\n";
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio = getPreciobase()* dias;
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp=false;
        if (!c.isEmpty()){
             getComentarios().add(c);
             resp=true;
        }
        return resp;
    }
    
    
}
