package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ej19 {
    
    // Necesitamos crear un programa para mostrar el ranking de puntuaciones 
    // de un torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que 
    // introduzca las puntuaciones de todos los jugadores (habitualmente 
    // valores entre 1000 y 2800, de tipo entero) y luego muestre las 
    // puntuaciones en orden descendente (de la más alta a la más baja).
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        Integer valores[] = new Integer[8], N=0;
        
        for (int i = 0; i < valores.length; i++) {
            
            do{
                System.out.println((1+i) + ". Introduce un número entero: ");
                N = reader.nextInt();
                
            }while(N < 1000 || N > 2800);
            
            valores[i] = N;
        }
        
        Arrays.sort(valores, Collections.reverseOrder());

        System.out.println("\n Los valores son: " + Arrays.toString(valores));
    }
}

