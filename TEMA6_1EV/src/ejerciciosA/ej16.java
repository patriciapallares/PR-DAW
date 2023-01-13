package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;

public class ej16 {
    
    // PENDIENTE
    
    //  Crea un programa que cree un array de enteros e introduzca la siguiente 
    // secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
    // hasta introducir 10 diez veces, y luego la muestre por pantalla. 
    // En esta ocasión has de utilizar Arrays.fill().
    

    public static void main(String[] args){
  
        int[] array = new int[55];

        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            int contador = 0;

                Arrays.fill(array, contador,contador+i,i);
                contador +=i;

    }

    for (int i = 0; i < 55; i++) {

      System.out.print(array[i] + " ");

    }


    }

   
}
