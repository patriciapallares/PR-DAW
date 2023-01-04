package ejerciciosA;

/**
 *
 * @author patriciapallares
 */
import java.util.Arrays;
import java.util.Scanner;

public class ej7 {

    // Crea un programa que pida dos valores enteros N y M, 
    // luego cree un array de tamaño N, escriba M en todas 
    // sus posiciones y lo muestre por pantalla.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int N,M;
        System.out.println("Introduce un número entero: ");
        N = reader.nextInt();
        
        System.out.println("Introduce otro número entero: ");
        M = reader.nextInt();
        
        int valores[] = new int[N];


        for (int i = 0; i < valores.length; i++) {
            valores[i] = M;
        }

        System.out.println("El array generado es: " + Arrays.toString(valores));
    }
}
