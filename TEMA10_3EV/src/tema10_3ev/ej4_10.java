package tema10_3ev;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class ej4_10 {

    public static void main(String[] args) {

        int aleat = (int) (1 + Math.random() * (10 + 1));
        int valores[] = new int[aleat];
        int posicion;
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {

            int nuevoNum = (int) (0 + Math.random() * (10 + 1));
            valores[i] = nuevoNum;

        }
        do {
            System.out.println("¿Qué posición del vector quieres ver? Introduce un "
                    + "valor entre " + 0 + " y " + (aleat - 1) + ". Introduce un número"
                    + " negativo para terminar el programa.");
            posicion = reader.nextInt();

            // ¿se podría controlar la excepción del negativo?
            if (posicion > -1) {
                try {
                    System.out.println("El número es: " + valores[posicion]);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Valor introducido incorrecto. Vuelve a introducir el valor.");
                    posicion = reader.nextInt();
                }
            }

        } while (posicion > -1);

        System.out.println("Programa terminado.");
    }
}
