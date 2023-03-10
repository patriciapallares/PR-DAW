package ejercicios9;

/**
 *
 * @author patgon
 */
public class ej1_9Producto {
    
    private String nombre;
    private int cantidad;

    public ej1_9Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }  

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
