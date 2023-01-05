package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ej11 {

    // Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
    // introducirá en el primer array todos los valores del 1 al 100. 
    // Por último, deberá copiar todos los valores del primer array al 
    // segundo array en orden inverso, y mostrar ambos por pantalla.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        Integer valores[]= new Integer[100], valoresInv[]= new Integer[100], valor;
        
        for(int i=0;i<valores.length;i++){
            valores[i] = i+1; 
        }
        
        System.out.println("El array generado es: " + Arrays.toString(valores));
        
        System.arraycopy(valores, 0, valoresInv, 0, valores.length);
        
        Arrays.sort(valoresInv, Collections.reverseOrder());
        
        System.out.println("El otro array generado es: " + Arrays.toString(valoresInv));
    }
}
