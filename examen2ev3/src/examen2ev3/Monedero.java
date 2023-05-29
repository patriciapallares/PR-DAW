package examen2ev3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author patgon
 */
public class Monedero {

    private static ArrayList<Dinero> listaDinero;

    // constructor 1
    public Monedero() {
        this.listaDinero = new ArrayList<Dinero>();
    }

    // constructor 2
    public Monedero(ArrayList<Dinero> dineros) {
        this.listaDinero = dineros;
    }

    // métodos
    public float disponible() {
        /*
        Devuelve la cantidad disponible en mi monedero, la suma del
        valor de todos los billetes y los saldos (saldo + crédito) 
        de mis tarjetas
         */

        Dinero din;
        float sumaBilletes = 0;
        float sumaSaldos = 0;

        Iterator<Dinero> iterator = listaDinero.iterator();
        while (iterator.hasNext()) {
            din = iterator.next();
            if (din instanceof Billete) {
                sumaBilletes += ((Billete) din).getValor();
            } else if (din instanceof Tarjeta) {
                sumaSaldos += ((Tarjeta) din).valor();
            }
        }
        return sumaBilletes + sumaSaldos;

    }

    public float metalico() {
        /*
        devolver la cantidad en metálico (billetes) que llevo en mi
        monedero.
         */

        Dinero din;
        float sumaBilletes = 0;

        Iterator<Dinero> iterator = listaDinero.iterator();
        while (iterator.hasNext()) {
            din = iterator.next();
            if (din instanceof Billete) {
                sumaBilletes += ((Billete) din).getValor();
            }
        }

        return sumaBilletes;
    }

    public boolean addDinero(Dinero x) {
        // Mis listas
        /*
        añade un objeto de tipo Dinero al ArrayList, devolverá
        true si la inserción se realiza correctamente y false en caso contrario 
        (tarjeta repetida).
         */

        // TODO verificar que la tarjeta no está en el monedero
        String numTarjeta = "";
        boolean insertado = false;
        if (x instanceof Tarjeta tarjeta) {
            numTarjeta = ((Tarjeta) x).getNum();

            if (x != null && !existeTarjeta(numTarjeta)) {
                insertado = listaDinero.add(x);
            } else {
                System.out.println("No se puede introducir la misma tarjeta de nuevo.");
            }
        } else if (x instanceof Billete billete) {
            if (x != null) {
                insertado = listaDinero.add(x);
            }
        }

        return insertado;

    }

    public boolean removeBillete(int x) {
        /*
        borra un objeto de tipo Billete del ArrayList, devolverá
        true si el borrado se realiza correctamente y false en caso contrario 
        (no hay billetes de ese valor).
         */

        boolean borrado = false;
        if (existeBillete(x)) {
            borrado = listaDinero.remove(buscaBillete(x));
        }

        return borrado;

    }

    public boolean sacaSaldo(String num, float x) {
        /*
        Devolverá true si se realiza correctamente (existe la tarjeta con ese 
        num y hay (saldo+crédito) disponible) y false en caso contrario 
        (no hay suficiente dinero en la tarjeta).
         */

        // Hola. Hauria d'haver fet lo gordo del mètode ací i cridar-lo en Persona.paga()
        // pendiente terminar
        return true;
    }

    public static boolean existeTarjeta(String num) {
        boolean encontrado = false;

        Dinero din = null;
        String otroNum = "";

        Iterator<Dinero> iterator = listaDinero.iterator();
        while (iterator.hasNext() && encontrado == false) {

            din = iterator.next();

            if (din instanceof Tarjeta tarjeta) {
                otroNum = tarjeta.getNum();

                if (otroNum.equals(num)) {
                    encontrado = true;
                }
            }
        }

        return encontrado;

    }

    public boolean existeBillete(int valor) {
        boolean encontrado = false;

        Dinero din = null;
        float otroValor;

        Iterator<Dinero> iterator = listaDinero.iterator();
        while (iterator.hasNext() && encontrado == false) {

            din = iterator.next();

            if (din instanceof Billete billete) {
                otroValor = billete.getValor();

                if (otroValor == valor) {
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    public Dinero buscaBillete(int cantidad) {

        Dinero din = null, enc = null;

        boolean encontrado = false;
        Iterator<Dinero> iterator = listaDinero.iterator();

        while (iterator.hasNext() && encontrado == false) {
            din = iterator.next();
            if (din instanceof Billete billete) {
                if (((Billete) din).getValor() == cantidad) {
                    enc = din;
                    encontrado = true;
                }
            }
        }

        return enc;

    }

    public Dinero buscaTarjeta(String num) {

        Dinero din = null, enc = null;

        boolean encontrado = false;
        Iterator<Dinero> iterator = listaDinero.iterator();

        while (iterator.hasNext() && encontrado == false) {
            din = iterator.next();
            if (din instanceof Tarjeta tarjeta) {
                if (((Tarjeta) din).getNum().equals(num)) {
                    enc = din;
                    encontrado = true;
                }
            }
        }

        return enc;

    }

    public boolean actualizaTarjeta(String num, float nuevoSaldo, float nuevoCredito) {
        boolean actualizado = false;
        Dinero din = buscaTarjeta(num);

        if (din instanceof Tarjeta tarjeta) {
            // actualizar saldo
            ((Tarjeta) din).setSaldo(nuevoSaldo);
            // actualizar credito
            ((Tarjeta) din).setCredito(nuevoCredito);
        }

        return actualizado;
    }

    // L'he fet void en comptes de String
    public void muestraMonedero() {

        Dinero din;
        float bills = 0;
        float tars = 0;

        Iterator<Dinero> iterator = listaDinero.iterator();
        while (iterator.hasNext()) {
            din = iterator.next();
            if (din instanceof Billete) {
                bills += 1;
            } else if (din instanceof Tarjeta) {
                tars += 1;
            }
        }

        System.out.println("Hay " + bills + " billetes y " + tars + " tarjetas.");

        while (iterator.hasNext()) {
            din = iterator.next();
            if (din instanceof Billete) {
                System.out.println("Valor billete: "+din.valor());
            } else if (din instanceof Tarjeta) {
                System.out.println("Valor tarjeta: "+din.valor());
            }
        }
    }
}
