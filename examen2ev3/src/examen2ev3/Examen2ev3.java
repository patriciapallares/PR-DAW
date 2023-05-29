package examen2ev3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class Examen2ev3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Persona p1;
        Persona p2;
        int opcion, cantidad;
        float saldo, credito;
        String borrar, dni, num;
        Billete b;
        Tarjeta t;

        System.out.println("Hola");
        System.out.println("Crea la persona 1");
        p1 = nuevaPersona();

        System.out.println("Crea la persona 2");
        p2 = nuevaPersona();

        // pendiente terminar
        do {
            do {
                opcion = -1;
                System.out.println();
                System.out.println("1. Añadir billete.");
                System.out.println("2. Añadir tarjeta.");
                System.out.println("3. Muestra cantidad disponible.");
                System.out.println("4. Muestra metálico.");
                System.out.println("5. Muestra monedero.");
                System.out.println("6. Paga una cantidad.");
                System.out.println("0. Salir\n");
                System.out.println("");
                try {
                    System.out.print("Elige una opción del menú :");
                    opcion = reader.nextInt();
                    if (opcion < 0 || opcion > 9) {
                        System.out.println("Error: Opción incorrecta! ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! no has introducido un número.");
                    borrar = reader.nextLine();
                    opcion = -1;
                }
            } while (opcion < 0 || opcion > 6);
            borrar = reader.nextLine();
            switch (opcion) {
                case 1: // Añadir billete

                    // Pendiente preguntar cuántos billetes y hacer un bucle
                    // Pendiente validador cantidades correctas
                    System.out.println("¿De cuánto es el billete?");
                    cantidad = reader.nextInt();
                    borrar = reader.nextLine();

                    System.out.println("¿Para qué persona? Introduce el DNI");
                    dni = reader.nextLine();

                    if (p1.getDni().equals(dni)) {
                        b = new Billete(cantidad);
                        p1.getMonedero().addDinero(b);
                    } else if (p2.getDni().equals(dni)) {
                        b = new Billete(cantidad);
                        p1.getMonedero().addDinero(b);
                    }

                case 2: // Añadir tarjeta
                    System.out.println("Número de la tarjeta");
                    num = reader.nextLine();

                    System.out.println("Introduce el saldo: ");
                    saldo = reader.nextFloat();

                    System.out.println("Introduce el crédito: ");
                    credito = reader.nextFloat();

                    System.out.println("¿Para qué persona? Introduce el DNI");
                    dni = reader.nextLine();

                    if (p1.getDni().equals(dni)) {
                        t = new Tarjeta(num, saldo, credito);
                        p1.getMonedero().addDinero(t);
                    } else if (p2.getDni().equals(dni)) {
                        t = new Tarjeta(num, saldo, credito);
                        p1.getMonedero().addDinero(t);
                    }

                case 3: // muestra cantidad disponible
                    System.out.println("¿Para qué persona? Introduce el DNI");
                    dni = reader.nextLine();

                    if (p1.getDni().equals(dni)) {
                        p1.getMonedero().disponible();
                    } else if (p2.getDni().equals(dni)) {
                        p2.getMonedero().disponible();
                    }
                case 4:
                    System.out.println("¿Para qué persona? Introduce el DNI");
                    dni = reader.nextLine();

                    if (p1.getDni().equals(dni)) {
                        p1.getMonedero().metalico();
                    } else if (p2.getDni().equals(dni)) {
                        p2.getMonedero().metalico();
                    }

                case 5:
                    System.out.println("¿Para qué persona? Introduce el DNI");
                    dni = reader.nextLine();

                    if (p1.getDni().equals(dni)) {
                        p1.getMonedero().muestraMonedero();
                    } else if (p2.getDni().equals(dni)) {
                        p2.getMonedero().muestraMonedero();
                    }

                case 6:
                    System.out.println("¿Para qué persona? Introduce el DNI");
                    dni = reader.nextLine();
                    
                    // pendiente validar
                    // pendiente terminar
                    System.out.println("¿Qué cantidad?");
                    

                    if (p1.getDni().equals(dni)) {
                       
                    } else if (p2.getDni().equals(dni)) {
                       
                    }

            }

        } while (opcion != 0);
    }

    public static Persona nuevaPersona() {

        Scanner reader = new Scanner(System.in);
        String dni, nombre, resp;
        Persona p = null;

        boolean ok = false;
        do {
            System.out.println("Introduce un nombre: ");
            nombre = reader.nextLine();
            ok = Metodos.campoLleno(nombre);

        } while (!ok);
        ok = false;

        do {
            System.out.print("Introduce un DNI:");
            dni = reader.nextLine();
            ok = Metodos.dniValido(dni);
        } while (!ok);
        ok = false;

        do {
            System.out.println("¿Tiene monedero? S o N");
            resp = reader.nextLine();
            ok = Metodos.validarSN(resp);

            if (resp.equalsIgnoreCase("s")) {
                Monedero monedero = new Monedero();
                p = new Persona(dni, nombre, monedero);
            } else if (resp.equalsIgnoreCase("n")) {
                p = new Persona(dni, nombre);
            }
        } while (!ok);
        ok = false;

        return p;
    }

}
