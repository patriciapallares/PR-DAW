package programaCoche;

/**
 *
 * @author patgon
 */
public class Coche {

    private String color;
    private float cilindrada;
    private int plazas;
    private String propietario;

    public Coche() {
    }

    public Coche(String color, float cilindrada, int plazas, String propietario) {
        this.color = color;
        this.cilindrada = cilindrada;
        this.plazas = plazas;
        this.propietario = propietario;
    }

    public String getColor() {
        return color;
    }
    
    public float getCilindrada() {
        return cilindrada;
    }

    public int getPlazas() {
        return plazas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }    
    
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", cilindrada=" + cilindrada + ", plazas=" + plazas + ", propietario=" + propietario + '}';
    }
    
    public void imprimir() {
        System.out.println("Coche {" + "color=" + color + ", cilindrada=" + cilindrada + ", plazas=" + plazas + ", propietario=" + propietario + "}");
    }
        
    // visualiza(). Muestra los valores de las variables de instancia por pantalla.
        
}
