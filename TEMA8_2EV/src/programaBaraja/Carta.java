package programaBaraja;

/**
 *
 * @author patriciapallares
 */
public class Carta {
    
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {

        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    
    
}
