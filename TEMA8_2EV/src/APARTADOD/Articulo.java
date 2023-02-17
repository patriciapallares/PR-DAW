package APARTADOD;

/**
 *
 * @author patriciapallares
 */
public class Articulo {

    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;
    
    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){
        if(nombre.equals("")){
            System.err.println("Error! El nombre no puede estar vacío.");
        } else if (precio <= 0) {
            System.err.println("Error! El precio no puede ser menor o igual a cero.");
        } else if (iva != 21) {
            System.err.println("Error! El iva debe ser el 21%.");
        } else if (cuantosQuedan < 0){
            System.err.println("Error! El stoc no puede ser menor que cero.");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getIva() {
        return iva;
    }      
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }    
   
    public void setIva(int iva) {
        this.iva = iva;
    } 
    
}
