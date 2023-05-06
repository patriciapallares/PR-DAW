package ejercicios9;
// patgon
public class AstrosEj2_9 {
    
    private double radio;
    private double rotacion;
    private double masa;
    private double temp;
    private double gravedad;

    public AstrosEj2_9(double radio, double rotacion, double masa, double temp, double gravedad) {
        this.radio = radio;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temp = temp;
        this.gravedad = gravedad;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getRadio() {
        return radio;
    }

    public double getRotacion() {
        return rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public double getTemp() {
        return temp;
    }

    public double getGravedad() {
        return gravedad;
    }
    
    
    
}
