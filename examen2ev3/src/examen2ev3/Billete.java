package examen2ev3;

/**
 *
 * @author patgon
 */
public class Billete extends Dinero {

    private int valor;

    // constructor 1
    public Billete(int valor, String color, float ancho, float alto) {
        super(color, ancho, alto);
        this.valor = valor;
    }

    // constructor 2
    public Billete(int valor, float ancho, float alto) {
        super(ancho, alto);
        this.valor = valor;
    }

    // constructor 3
    public Billete(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public float valor() {
        return this.valor;
    }
}
