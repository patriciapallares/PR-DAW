/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class AudioLibro extends Libro {
    // atributos de clase
    // Código único
    private static int numCod = 1;
    
    // atributos
    private boolean sintetizador;
    private int   horasDuracion;
    private int   minDuracion;
    
    // Constructor: 
    public AudioLibro(boolean sintetizador, int horasDuracion, int minDuracion, 
            int numPaginas, String nombre, String fecha, int anyo, 
            String resumen, Autor autor, boolean deteriorado) {
        super(numPaginas, "LAU"+numCod, nombre, fecha, anyo, resumen, autor, 
              deteriorado);
        this.sintetizador = sintetizador;
        this.horasDuracion = horasDuracion;
        this.minDuracion = minDuracion;
        // Incrementar código único
        numCod++;
    }


    public int getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(int horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    public int getMinDuracion() {
        return minDuracion;
    }

    public void setMinDuracion(int minDuracion) {
        this.minDuracion = minDuracion;
    }


    public boolean isSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(boolean sintetizador) {
        this.sintetizador = sintetizador;
    }
  
    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio =  (getPreciobase()* dias);
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
   
    @Override
    public String info() {
        String resp = null;
        resp= "Codigo AudioLibro:" +this.getCodArt()+"\n"+
              "Nombre=" +getNombre() +"\n"+
              "Año Publicación:" +getAnyo()+"\n"+
              "Resumen: " +getResumen()+"\n"+
              "Autor: " +getAutor().info() +"\n"+
              "¿Esta Deteriorado? : " + isDeteriorado() +"\n"+
              "¿Tiene Sintetizador ? " +isSintetizador()+"\n"+
              "Horas de Duracion: " + getHorasDuracion()+ "\n"+
              "Minutos Duracion: " +getMinDuracion();
      
        return resp;
      
    }

    @Override
    public String toString() {
        return "AudioLibro{" + "sintetizador=" + sintetizador + ", "
                + "horasDuracion=" + horasDuracion + ", minDuracion=" 
                + minDuracion + '}';
    }

}
