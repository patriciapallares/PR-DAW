package examen2ev3;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class Persona {

    private String dni;
    private String nombre;
    private Monedero monedero;

    public Persona(String dni, String nombre, Monedero monedero) {
        this.dni = dni;
        this.nombre = nombre;
        this.monedero = monedero;
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Persona(String nombre, Monedero monedero) {
        this.nombre = nombre;
        this.monedero = monedero;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Monedero getMonedero() {
        return monedero;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonedero(Monedero monedero) {
        this.monedero = monedero;
    }

    // métodos
    /*
    Una persona intenta pagar una cantidad con una tarjeta,
    si es posible pagar, disminuirá el saldo y/o el crédito de la tarjeta.
     */
    public boolean paga(float cantidad) {
        boolean pagado = false;
        Scanner reader = new Scanner(System.in);
        Monedero monederoP = this.monedero;
        String num;
        Dinero din = null;
        float nuevoSaldo = 0, nuevoCredito = 0;

        System.out.println("¿Cuál es el número de la tarjeta?");
        num = reader.nextLine();

        if (monederoP.existeTarjeta(num)) {
            din = monederoP.buscaTarjeta(num);

            if (din instanceof Tarjeta tarjeta) {
                if (din.valor() - cantidad < 0) {
                    System.out.println("No se puede realizar la operación. Supera saldo+crédito");
                    pagado = false;
                } else if (((Tarjeta) din).getSaldo() < cantidad) {
                    nuevoSaldo = ((Tarjeta) din).getSaldo() - cantidad;
                    nuevoCredito = ((Tarjeta) din).getCredito() - nuevoSaldo;
                    nuevoSaldo = 0;
                    // actualizar tarjeta
                    monederoP.actualizaTarjeta(num, nuevoSaldo, nuevoCredito);
                    pagado = true;
                } else if (((Tarjeta) din).getSaldo() > cantidad) {
                    nuevoSaldo = ((Tarjeta) din).getSaldo() - cantidad;
                    nuevoCredito = ((Tarjeta) din).getCredito();
                    // actualizar tarjeta
                    monederoP.actualizaTarjeta(num, nuevoSaldo, nuevoCredito);
                    pagado = true;
                }
            }
        }

        return pagado;
    }
}
