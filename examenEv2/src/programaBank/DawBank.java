package programaBank;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class DawBank {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String iban = "", nombreTitular, apellidosTitular;

        float cantidad;

        CuentaBancaria c;

        int opcion;

        System.out.println("¡Hola! Crea la cuenta bancaria.");

        System.out.println("Introduce el nombre:");
        nombreTitular = reader.nextLine();

        System.out.println("Introduce los apellidos:");
        apellidosTitular = reader.nextLine();

        // validación del demoni
        do {
            System.out.println("Introduce la cuenta bancaria (Ej: ES6621000418401234567891): ");
            iban = reader.nextLine();
        } while (iban.charAt(0) == '0' || iban.charAt(0) == '1'
                || iban.charAt(0) == '2' || iban.charAt(0) == '3'
                || iban.charAt(0) == '4' || iban.charAt(0) == '5'
                || iban.charAt(0) == '6' || iban.charAt(0) == '7'
                || iban.charAt(0) == '8' || iban.charAt(0) == '9'
                || iban.charAt(1) == '0' || iban.charAt(1) == '1'
                || iban.charAt(1) == '2' || iban.charAt(1) == '3'
                || iban.charAt(1) == '4' || iban.charAt(1) == '5'
                || iban.charAt(1) == '6' || iban.charAt(1) == '7'
                || iban.charAt(1) == '8' || iban.charAt(1) == '9'
                || iban.length() != 24);

        c = new CuentaBancaria(iban, nombreTitular, apellidosTitular);

        System.out.println(" - Programa DawBank - \n Menú");

        do {
            System.out.println(" - - - - - "
                    + "\n 1. Datos de la cuenta"
                    + "\n 2. IBAN"
                    + "\n 3. Titular"
                    + "\n 4. Saldo"
                    + "\n 5. Ingreso"
                    + "\n 6. Retirada"
                    + "\n 7. Movimientos"
                    + "\n 8. Salir"
                    + "\n - - - - - ");
            opcion = reader.nextInt();

            if (opcion == 1) {

                // 1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.
                c.imprimir();

            } else if (opcion == 2) {

                // 2. IBAN. Mostrará el IBAN
                System.out.println("IBAN: " + c.getIban());

            } else if (opcion == 3) {

                // 3. Titular. Mostrará el titular.
                System.out.println("Titular: " + c.getNombreTitular() + " " + c.getApellidosTitular());

            } else if (opcion == 4) {

                // 4. Saldo. Mostrará el saldo disponible.
                System.out.println("Saldo: " + c.getSaldo());

            } else if (opcion == 5) {

                // 5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.
                System.out.println("¿Cuánto quieres ingresar?");
                cantidad = reader.nextFloat();

                c.ingresar(cantidad);
            } else if (opcion == 6) {

                // 6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.
                System.out.println("¿Cuánto quieres retirar?");
                cantidad = reader.nextFloat();

                if (c.getSaldo() == -50) {
                    System.out.println("AVISO: El saldo es negativo. No se puede retirar saldo.");
                } else {
                    c.retirar(cantidad);
                }

            } else if (opcion == 7) {
                c.imprimirMovimientos();
            }

        } while (opcion != 8);

        System.out.println("Programa terminado.");
    }
}
