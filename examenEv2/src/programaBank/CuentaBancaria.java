package programaBank;

/**
 *
 * @author patgon
 */
public class CuentaBancaria {

    final private String iban;
    final private String nombreTitular;
    final private String apellidosTitular;
    private float saldo;
    private static Movimiento[] movimientos;
    public static final int num_movimientos = 100;
    private static int posicionMovimiento;

    public CuentaBancaria(String iban, String nombreTitular, String apellidosTitular) {
        this.iban = iban;
        this.nombreTitular = nombreTitular;
        this.apellidosTitular = apellidosTitular;
        this.saldo = 0;
        this.posicionMovimiento = 0;
        this.movimientos = new Movimiento[num_movimientos];
    }

    public String getIban() {
        return iban;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    //
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    // métodos
    public void imprimir() {
        System.out.println("CuentaBancaria { " + "IBAN: " + iban + ". Titular: " + nombreTitular + " " + apellidosTitular + ". Saldo: " + saldo + "€}");
    }

    public static void anadirMovimiento(String concepto, float cantidad) {

        Movimiento m = new Movimiento(concepto, cantidad);

        movimientos[posicionMovimiento] = m;
        siguienteMovimiento();
    }

    public static int siguienteMovimiento() {
        if (posicionMovimiento == num_movimientos) {
            return 0;
        } else {
            posicionMovimiento++;
        }
        return posicionMovimiento;
    }

    public void imprimirMovimientos() {

        for (int i = 0; i < numMovimientos(movimientos); i++) {
            movimientos[i].imprimirMovimientos();
        }

    }

    public static int numMovimientos(Movimiento movimientos[]) {
        int totalMovimientos = 0;
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] != null) {
                totalMovimientos++;
            }
        }
        return totalMovimientos;
    }

    public void ingresar(float cantidad) {
        String concepto="Ingreso";
        this.saldo += cantidad;
        System.out.println("Ingreso realizado con éxito.");
        if (cantidad >= 3000) {
            System.out.println("AVISO: Notificar a hacienda.");
        }
        anadirMovimiento(concepto,cantidad);
    }

    public void retirar(float cantidad) {
        String concepto="Retirada";
        this.saldo -= cantidad;
        System.out.println("Cantidad retirada con éxito.");
        if (this.saldo < 0) {
            System.out.println("AVISO: Saldo negativo.");
        }
        anadirMovimiento(concepto,cantidad);
    }

}
