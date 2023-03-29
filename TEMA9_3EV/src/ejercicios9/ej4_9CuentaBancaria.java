package ejercicios9;

public class ej4_9CuentaBancaria {
    
    private String iban;
    private float saldo;

    public ej4_9CuentaBancaria(String iban, float saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }
    
    // getters

    public String getIban() {
        return iban;
    }

    public float getSaldo() {
        return saldo;
    }
    
    // setters

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
}
