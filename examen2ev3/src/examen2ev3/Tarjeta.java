package examen2ev3;

/**
 *
 * @author patgon
 */
public class Tarjeta extends Dinero {

    private String num;
    private float saldo;
    private float credito;

    public Tarjeta(String num, float saldo, float credito, String color, float ancho, float alto) {
        super(color, ancho, alto);
        this.num = num;
        this.saldo = saldo;
        this.credito = credito;
    }

    public Tarjeta(String num, float saldo, float credito) {
        this.num = num;
        this.saldo = saldo;
        this.credito = credito;
    }
    

    public String getNum() {
        return num;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getCredito() {
        return credito;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    @Override
    public float valor() {
        return this.credito + this.saldo;
    }
}
