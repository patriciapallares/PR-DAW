package APARTADOE;
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
    
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }      
    
    public void setNombre(String nombre) {
        if (nombre.equals("")){
            System.err.println("¡¡ERROR!! El nombre no puede estar vacío.");
        }else{
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.err.println("Error! El precio no puede ser menor o igual a cero.");
        }else{
            this.precio = precio;
        } 
    }    
   
    public void setIva(int iva) {
        if (iva != 21) {
            System.err.println("Error! El iva debe ser el 21%.");
        }else{
            this.iva = iva;
        }
    } 
    
    public void setCuantosQuedan(int cuantosQuedan){
        if (cuantosQuedan < 0){
            System.err.println("Error! El stoc no puede ser menor que cero.");
        }else{
            this.cuantosQuedan = cuantosQuedan;
        }
    }
    
    
    public void imprime(){
        System.out.println(nombre + " - Precio: " + precio + "€ - IVA: " + iva + "% - PVP: "+ (precio + (precio*iva/100))+"€.");
    }
    
    public double getPVP(){
        return (precio + (precio*iva/100));
    }
    
    public double getPVPDescuento(int descuento){
        return (precio + (precio*descuento/100));
    }
    
    // método vender
    
    public boolean vender(int unidades){
        int cuantos = this.cuantosQuedan;
        if (cuantos + unidades > 0){
            this.setCuantosQuedan(cuantos - unidades);
            return true;
        }else{
            return false;
        }
    }
    
    // método almacenar
    
    public boolean almacenar(int unidades){
        int cuantos = this.cuantosQuedan;
        if (cuantos + unidades > 0){
            this.setCuantosQuedan(cuantos + unidades);
            return true;
        }else{
            return false;
        }
    }
    
    
}
