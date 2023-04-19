package tema10_3ev;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class ej6_10 {

    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        Gato ga;
        String nombre, basura;
        int edad;

        // ArrayList<Gato> listaGatos = new ArrayList<Gato>();

        for (int i = 0; i < 3; i++) {

            try {
                System.out.println("Introduce el nombre del gato " + (i + 1) + ": ");
                nombre = reader.nextLine();

                System.out.println("Introduce la edad del gato " + (i + 1) + ": ");
                edad = reader.nextInt();
                basura = reader.nextLine();

                ga = new Gato(nombre, edad);

            } catch (Exception ex) {
                // System.out.println("Algún error.¿?" +ex);

                // ex.getMessage();
                ex.printStackTrace();
            }
        }
    }
}
