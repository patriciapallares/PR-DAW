package tema11_3ev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B_ej1_11 {

    public static void main(String[] args) throws FileNotFoundException {

        File numeros = new File("/Users/patriciapallares/Downloads/Documentos/numeros.txt");

        Scanner lector = new Scanner(numeros);

        int acum = 0, valor, mayor = 0, menor = 0;

        try {

            while (lector.hasNextLine()) {
                lector.nextLine();
                acum++;
            }

            lector.close();

            System.out.println("Total Number of Lines: " + acum);

            int valores[] = new int[acum];

            Scanner lector2 = new Scanner(numeros);
            for (int i = 0; i < acum - 1; i++) {
                int num = lector2.nextInt();
                valores[i] = num;
            }

            for (int i = 0; i < valores.length; i++) {

                if (mayor == 0 && menor == 0) {
                    mayor = valores[i];
                    menor = valores[i];
                } else if (valores[i] > mayor) {
                    mayor = valores[i];
                } else if (valores[i] < menor) {
                    menor = valores[i];
                }
            }
            System.out.println("El mayor es: " + mayor);
            System.out.println("El menor es: " + menor);
            // ¡Hay que cerrar el fichero! 
            lector2.close();

        } catch (Exception e) {
            // En caso de excepción mostramos el error 
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
}
