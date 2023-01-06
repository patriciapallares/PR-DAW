package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;

public class ej18 {

    // Crea un programa que cree un array de tamaño 30 y lo rellene con valores
    // aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los 
    // valores del array y los mostrará por pantalla.
    
    public static void main(String[] args) {

        int valores[] = new int[30];
               
        for (int i = 0; i < valores.length; i++) {
            // int aleatorio entre 0 y 10
            int aleat = (int) (0 + Math.random() * (10+1));
            valores[i] = aleat;
        }
        Arrays.sort(valores);
        
        System.out.println("\n Los valores son: " + Arrays.toString(valores));
    }
}

