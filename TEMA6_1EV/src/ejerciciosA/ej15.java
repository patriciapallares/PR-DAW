package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej15 {
    
    // Crea un programa que pida la usuario dos valores N y M y luego cree un 
    // array de tamaño N que contenga M en todas sus posiciones. Luego muestra 
    // el array por pantalla.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int N,M;
        System.out.println("Introduce un número entero: ");
        N = reader.nextInt();
        
        System.out.println("Introduce otro número entero: ");
        M = reader.nextInt();
        
        int valores[] = new int[N];

        Arrays.fill(valores,M);

        System.out.println("El array generado es: " + Arrays.toString(valores));
    }
}
