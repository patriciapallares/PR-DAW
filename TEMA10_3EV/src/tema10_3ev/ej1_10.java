package tema10_3ev;

import java.util.*;

/**
 *
 * @author patgon
 */
public class ej1_10 {

    public static void main(String[] args) {
        int A;
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Introduzca un número: ");
            A = reader.nextInt();
            System.out.println("Valor introducido: " + A);
        } catch (InputMismatchException ex) {
            System.out.println("Valor introducido incorrecto.");

            ex.printStackTrace();
        }

        System.out.println("Fin del programa.");

        // excep InputMismatchException
    }

}
