package examen2ev3;

public abstract class Dinero {

    private String color;
    private float ancho;
    private float alto;
    
    /*
    private String colorDefault = "rojo";
    private float anchoDefault = 0f;
    private float altoDefault = 0f;

    */
    public Dinero(String color, float ancho, float alto) {
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Dinero(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Dinero() {
    }
    
    

    public String getColor() {
        return color;
    }

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public abstract float valor();
}
