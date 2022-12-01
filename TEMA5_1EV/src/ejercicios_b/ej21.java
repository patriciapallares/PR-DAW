package ejercicios_b;

import java.util.Scanner;

public class ej21 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int A, B, accPares = 0;
        String numCadena = "";

        System.out.println("Introduce un número: ");
        A = reader.nextInt();

        System.out.println("Introduce otro número mayor al anterior: ");
        B = reader.nextInt();

        for (int i = A; i <= B; i++) {
            numCadena += Integer.toString(i);
            numCadena += " ";
            if (i % 2 == 0) {
                accPares++;
            }
        }

        System.out.println(numCadena);
        System.out.println("La cantidad de pares son: " + accPares);

    }
}
