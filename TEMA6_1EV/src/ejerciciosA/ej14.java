package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;


public class ej14 {

    // Crea un programa que cree un array de enteros e introduzca la siguiente 
    // secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
    // hasta introducir 10 diez veces, y luego la muestre por pantalla.
    
    public static void main (String[] args){

        int valores[] = new int[55];
        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
            valores[cont] = i;
            cont++;
            }
        }
        
        System.out.println(Arrays.toString(valores));
    }
}

