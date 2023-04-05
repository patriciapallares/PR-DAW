package tema10_3ev;

import java.util.*;

/**
 *
 * @author patgon
 */
public class ej2_10 {

    public static void main(String[] args) {
        int A, B;
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Introduzca un número: ");
            A = reader.nextInt();
            System.out.println("Introduzca otro número: ");
            B = reader.nextInt();

            System.out.println("El resultado es: " + A / B);
        }
        catch (InputMismatchException ex1) {
            System.out.println("Valor introducido incorrecto.");
        }
        catch (ArithmeticException ex2){
            System.out.println("No se puede dividir por 0.");
        }
        System.out.println("Fin del programa.");
    }
}
