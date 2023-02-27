package ejercicioObligatorio8;

/**
 *
 * @author patriciapallares
 */
public class Cuenta {
    
    private int numCuenta;
    private float saldoCuenta;

    public Cuenta(int numCuenta, float saldoCuenta) {
        
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    // consultar el saldo disponible en cualquier momento
    public float getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        if(numCuenta<0 || numCuenta>9999 ){
            System.err.println("¡Error! Introduce un número de cuenta válido.");
        }else{
            this.numCuenta = numCuenta;
        }
    }

    public void setSaldoCuenta(float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    // métodos
    
    // recibir abonos
    public void recibirAbonos(float abonos){
        this.saldoCuenta += abonos;
    }
    
    // pagar recibos
    public void realizarPagos(float pagos){
        this.saldoCuenta -= pagos;
    }
}
