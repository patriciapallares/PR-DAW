package programaAgenda;

/**
 *
 * @author patriciapallares
 */
public class Contacto {
 
    private String nombre;
    private String telf;

    // insert code constructor, getter y setter wtf
    public Contacto(String nombre, String telf) {
        this.nombre = nombre;
        this.telf = telf;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelf() {
        return telf;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    // insert code toString()
    public String imprimir() {
        return "Contacto{" + "nombre=" + nombre + ", telf=" + telf + '}';
    }
    
    public boolean sonIguales(Contacto c){
        
        if(this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }
        
        return false;
    }
    
}
