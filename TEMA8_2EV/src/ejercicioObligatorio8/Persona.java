package ejercicioObligatorio8;

/**
 *
 * @author patriciapallares
 */
public class Persona {

    private String dni;
    private Cuenta[] cuentas;

    public Persona(String dni, Cuenta[] cuentas) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
    }

    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    // podría añadir validaciones
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    // métodos
    // añadir cuenta
    public void anyadirCuentas(Cuenta c) {
        boolean anyadido = false;
        if (cuentas[0] != null && cuentas[1] != null && cuentas[2] != null) {
            System.out.println("Máximo de cuentas alcanzado");
        } else {

            for (int i = 0; i < cuentas.length; i++) {
                if (cuentas[i] == null) {
                    cuentas[i] = c;
                    anyadido = true;
                    // Importantísimo para que no haga 3 veces lo mismo 
                    break;
                }
            }
        }
        if (anyadido) {
            System.out.println("Cuentas añadida.");
        } else {
            System.out.println("No se ha podido añadir.");
        }
    }

    // devolver si la persona es morosa
    public boolean esMorosa(Cuenta c) {
        return cuentas[0].getSaldoCuenta() < 0 || cuentas[1].getSaldoCuenta() < 0 || cuentas[2].getSaldoCuenta() < 0;
    }

    public void mostrarCuentas() {

        for (int i = 0; i < 2; i++) {
            if (cuentas[i] != null) {
                System.out.println("Cuenta " + (i + 1) + ". Saldo: " + cuentas[i].getSaldoCuenta());
            }else{
                System.out.println("No hay más cuentas.");
            }
        }
    }

}
