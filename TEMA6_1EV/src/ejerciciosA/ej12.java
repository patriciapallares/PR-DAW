package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ej12 {

    // Crea un programa que cree un array de 10 enteros y luego muestre el 
    // siguiente menú con distintas opciones:
    // a. Mostrar valores. b. Introducir valor. c. Salir.
    // La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ 
    // pedirá un valor V y una posición P, luego escribirá V en la posición 
    // P del array. El menú se repetirá indefinidamente hasta que el usuario 
    // elija la opción ‘c’ que terminará el programa.
    
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
