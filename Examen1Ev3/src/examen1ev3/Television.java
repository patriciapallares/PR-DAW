package examen1ev3;

/**
 *
 * @author patgon
 */
public class Television extends Electrodomestico {

    private double resolucion;
    private boolean wifi;

    final double resolucionDefecto = 20;
    final boolean wifiDefecto = false;

    public Television(String nombre) {
        super(nombre);
        this.resolucion = resolucionDefecto;
        this.wifi = wifiDefecto;
    }

    public Television(String nombre, double precioBase, double peso) {
        super(nombre, precioBase, peso);
        this.resolucion = resolucionDefecto;
        this.wifi = wifiDefecto;
    }

    public Television(double resolucion, boolean wifi, String nombre, double precioBase, String color, String consumoE, double peso) {
        super(nombre, precioBase, color, consumoE, peso);
        this.resolucion = resolucion;
        this.wifi = wifi;
    }

    // setter
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    // getter
    public double getResolucion() {
        return resolucion;
    }

    public boolean isWifi() {
        return wifi;
    }

    // métodos 
    public void mostrar() {

    }

    // ací m'he fet un poc de lio 
    public double precioFinal() {
        double precioInicial = precioInicial();
        double precioFinal = 0;

        if (this.resolucion > 40 && this.wifi == false) {
            precioFinal = (precioInicial + this.precioBase) * 1.30;
        } else {
            precioFinal = precioInicial + this.precioBase;
        }

        if (this.wifi == true && this.resolucion <= 40) {
            precioFinal = precioInicial + this.precioBase + 50;
        } else {
            precioFinal = precioInicial + this.precioBase;
        }

        if (this.resolucion > 40 && this.wifi == false) {
            precioFinal = ((precioInicial + this.precioBase) * 1.30) + 50;
        } else {
            precioFinal = precioInicial + this.precioBase;
        }
        
        return precioFinal;

    }
}
