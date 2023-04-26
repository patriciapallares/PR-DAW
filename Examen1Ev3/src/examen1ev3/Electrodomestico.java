package examen1ev3;

/**
 *
 * @author patgon
 */
public abstract class Electrodomestico {

    protected String nombre;
    protected double precioBase;
    protected String color;
    protected String consumoE;
    protected double peso;

    final double precioBaseDefecto = 100;
    final String colorDefecto = "blanco";
    final String consumoEDefecto = "F";
    final double pesoDefecto = 5;

    // TODO : hacer array con colores y letras
    // constructor por defecto
    // Los colores disponibles son blanco, negro, rojo, azul y gris. No debe 
    // importar si el nombre está en mayúsculas o en minúsculas.
    public Electrodomestico(String nombre) {
        this.nombre = nombre;
        this.precioBase = precioBaseDefecto;
        this.color = colorDefecto;
        this.consumoE = consumoEDefecto;
        this.peso = pesoDefecto;
    }

    // constructor precio y peso y resto por defecto
    public Electrodomestico(String nombre, double precioBase, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = colorDefecto;
        this.consumoE = consumoEDefecto;
        this.peso = peso;
    }

    // constructor con todos los atributos
    public Electrodomestico(String nombre, double precioBase, String color, String consumoE, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoE(String consumoE) {
        this.consumoE = consumoE;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoE() {
        return consumoE;
    }

    public double getPeso() {
        return peso;
    }

    // métodos
    private void comprobarConsumoE(char letra) {

    }

    private void comprobarColor(String color) {

    }

    public double precioInicial() {
        String[] letras = {"A","B","C","D","E","F"};
        double[] precios = {100, 80, 60, 50, 30, 10};

        char letraConsumo;
        double precioConsumo = 0, precioInicial = 0;

        for (int i = 0; i < letras.length; i++) {
            if (this.consumoE == letras[i]) {
                precioConsumo = precios[i];
            }
        }

        if (this.peso > 0 && this.peso <= 19) {
            precioInicial = precioConsumo + 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioInicial = precioConsumo + 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioInicial = precioConsumo + 80;
        } else if (this.peso > 80) {
            precioInicial = precioConsumo + 100;
        }

        return precioInicial;

    }

    public abstract double precioFinal();
    
}
