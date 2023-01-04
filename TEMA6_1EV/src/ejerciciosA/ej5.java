package ejerciciosA;

/**
 *
 * @author patriciapallares
 */
import java.util.Scanner;

public class ej5 {

    // Crea un programa que pida veinte números reales por teclado, 
    // los almacene en un array, y luego lo recorra para calcular y 
    // mostrar la media: (suma de valores) / nº de valores.
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int valores[] = new int[10], valor, suma = 0, media;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduce un número real: ");
            valor = reader.nextInt();
            valores[i] = valor;
        }

        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }

        media = suma / valores.length;

        System.out.println("La media es " + media);
    }
}
