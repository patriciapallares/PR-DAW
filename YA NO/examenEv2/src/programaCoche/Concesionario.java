package programaCoche;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class Concesionario {

    public static void main(String[] args) {

        int opcion; // guarda la opción del user
        Scanner reader = new Scanner(System.in);
        Coche c;
        String color, basura;
        float cilindrada;
        int plazas;
        String propietario;

        Coche arrayCoches[] = new Coche[10];

        System.out.println(" - Programa concesionario - \n Menú");

        do {
            System.out.println(" - - - - - "
                    + "\n 1. Crea coche."
                    + "\n 2. Vende un coche (cambia propietario)"
                    + "\n 3. Pinta el coche"
                    + "\n 4. Muestra coche"
                    + "\n 5. Salir"
                    + "\n - - - - - ");
            System.out.println("Introduzca una opción:");
            opcion = reader.nextInt();

            if (opcion == 1) {
                // 1. Crea coche.

                System.out.println("Introduce el color:");
                basura = reader.nextLine();
                color = reader.nextLine();

                System.out.println("Introduce la cilindrada:");
                cilindrada = reader.nextFloat();

                System.out.println("Introduce el número de plazas:");
                plazas = reader.nextInt();

                System.out.println("Introduce el nombre del propietario:");
                basura = reader.nextLine();
                propietario = reader.nextLine();

                //e(String color, float cilindrada, int plazas, String propietario) {
                c = new Coche(color, cilindrada, plazas, propietario);

                anadirCoche(c, arrayCoches);

            } else if (opcion == 2) {
                // 2. Vende un coche (cambia propietario?)
                int opcionAsociacion;

                System.out.println("A qué coche quieres cambiárle el propietario:");
                for (int i = 0; i < numCoches(arrayCoches); i++) {
                    System.out.println((i + 1) + ". Coche " + arrayCoches[i].getColor() + " de " + arrayCoches[i].getPropietario());
                }

                // 
                System.out.println("Introduce una opción (1-10): ");
                opcionAsociacion = reader.nextInt();

                System.out.println("¿Cuál es el nombre del nuevo propietario?");
                basura = reader.nextLine();
                propietario = reader.nextLine();
                // guardo el valor en el primer espacio disponible del array 
                arrayCoches[opcionAsociacion - 1].setPropietario(propietario);
                
            } else if (opcion == 3) {
                int opcionAsociacion;

                System.out.println("A qué coche quieres cambiárle el color:");
                for (int i = 0; i < numCoches(arrayCoches); i++) {
                    System.out.println((i + 1) + ". Coche " + arrayCoches[i].getColor() + " de " + arrayCoches[i].getPropietario());
                }

                // 
                System.out.println("Introduce una opción (1-10): ");
                opcionAsociacion = reader.nextInt();

                System.out.println("¿Cuál es el nuevo color?");
                basura = reader.nextLine();
                color = reader.nextLine();
                // guardo el valor en el primer espacio disponible del array 
                arrayCoches[opcionAsociacion - 1].setColor(color);
                
            } else if (opcion == 4) {

                int opcionAsociacion;

                System.out.println("Qué coche quieres mostrar:");
                for (int i = 0; i < numCoches(arrayCoches); i++) {
                    System.out.println((i + 1) + ". Coche " + arrayCoches[i].getColor() + " de " + arrayCoches[i].getPropietario());
                }

                System.out.println("Introduce una opción (1-10): ");
                opcionAsociacion = reader.nextInt();

                arrayCoches[opcionAsociacion - 1].imprimir();
            }

        } while (opcion != 0);

    }

    // Añadir coche al array
    // añadir coche
    public static void anadirCoche(Coche c, Coche arrayCoches[]) {

        // usamos un método dentro de este método
        if (arrayCochesLleno(arrayCoches)) {
            System.out.println("No hay espacio para más coches.");
        } else {
            boolean anyadido = false;
            for (int i = 0; i < arrayCoches.length; i++) {
                if (arrayCoches[i] == null) {
                    arrayCoches[i] = c;
                    anyadido = true;
                    // Importantísimo para que no haga 10 veces lo mismo wtf
                    break;
                }

            }

            if (anyadido) {
                System.out.println("Coche añadido.");
            } else {
                System.out.println("No se ha podido añadir.");
            }
        }
    }

    // arrayCoches lleno??
    public static boolean arrayCochesLleno(Coche arrayCoches[]) {

        for (int i = 0; i < arrayCoches.length; i++) {
            if (arrayCoches[i] == null) {
                return false;
            }
        }

        return true;
    }

    public static int numCoches(Coche arrayCoches[]) {
        int totalCoches = 0;
        for (int i = 0; i < arrayCoches.length; i++) {
            if (arrayCoches[i] != null) {
                totalCoches++;
            }
        }
        return totalCoches;
    }

}
