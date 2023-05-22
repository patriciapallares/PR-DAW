/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class Musica extends Articulo{
    // atributos de clase
    private static float suplemento = 2f;
    private static int numCod = 1;
    
    // atributos miembro
    private int nPistas;
    private float duracion;
    private String tipo; // cd o vinilo
    
    
    public Musica(int nPistas, float duracion, String tipo, String nombre, 
            String fecha, int anyo, String resumen, Autor autor, 
            boolean deteriorado) {
        super("MUS"+numCod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.nPistas = nPistas;
        this.duracion = duracion;
        this.tipo = tipo;
        numCod++;
    }
        
    //Getters y Setters:
    public static float getSuplemento() {
        return suplemento;
    }
 
    public static void setSuplemento(float suplemento) {
        Musica.suplemento = suplemento;
    }

    public int getnPistas() {
        return nPistas;
    }

    public void setnPistas(int nPistas) {
        this.nPistas = nPistas;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String info() {
         String resp = null;
        resp= "Codigo Articulo Musical: " +this.getCodArt()+"\n"+
              "Nombre=" +getNombre() +"\n"+
              "Año Publicación:" +getAnyo()+"\n"+
              "Resumen: " +getResumen()+"\n"+
              "Autor: " +getAutor().info() +"\n"+
              "¿Esta Deteriorado? : " + isDeteriorado() +"\n"+
              "Numero Pistas : " + getnPistas()+"\n"+
              "Duración: " +getDuracion()+"\n"+
              "Tipo :" +getTipo();
      
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio= getSuplemento() + (getPreciobase() * dias);
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
