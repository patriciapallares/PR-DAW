package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;

public class ej14 {
    
    // PENDIENTE

    // Crea un programa que cree un array de enteros e introduzca la siguiente 
    // secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
    // hasta introducir 10 diez veces, y luego la muestre por pantalla.
    
    public static void main(String[] args) {

        int valores[] = new int[10];
       
        
        for (int i = 0; i < valores.length; i++) { 
            
            valores[i] = i+1;
            int secu[] = new int[i];
            
            for (int j = 1; j < i; j++){
                
                secu[j] = j;
                System.out.println("El array generado es: " + Arrays.toString(secu));
                
            }

        }

        
    }
}
