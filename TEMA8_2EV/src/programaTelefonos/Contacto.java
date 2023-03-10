package programaTelefonos;

/**
 *
 * @author patgon
 */
public class Contacto {
    
    /*
    Un contacto está definido por un nombre y un teléfono (este teléfono
    será un fijo de Castellón, por lo que tiene que empezar por 964...). Un
    contacto es igual a otro cuando sus nombres son iguales.
    */
    
    private String telf;
    private String nombre;
    
    public Contacto(String telf, String nombre) {
        this.telf = telf;
        this.nombre = nombre;
    }
    
    public String getTelf() {
        return telf;
    }        
    
    public String getNombre() {
        return nombre;
    }
    
    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

}
