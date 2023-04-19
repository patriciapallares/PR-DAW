package tema10_3ev;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class ej5_10 {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int num;

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce un número positivo " + (i + 1) + ": ");
            num = reader.nextInt();
            imprimePositivo(num);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce un número negativo " + (i + 1) + ": ");
            num = reader.nextInt();
            imprimeNegativo(num);
        }
    }

    static void imprimePositivo(int p) throws Exception {
        Exception e = new Exception("El valor no puede ser negativo");

        try {
            if (p < 0) {
                throw e;
            } else {
                System.out.println("El número es: " + p);
            }
        } catch (Exception ex) {
            System.out.println("ERROR: Introduce un número positivo.");
        }
    }

    static void imprimeNegativo(int n) throws Exception {
        Exception ex = new Exception("El valor no puede ser positivo");

        try {
            if (n >= 0) {
                throw ex;
            } else {
                System.out.println("El número es: " + n);
            }
        } catch (Exception e) {
            System.out.println("ERROR: Introduce un número negativo.");
        }
    }
}
