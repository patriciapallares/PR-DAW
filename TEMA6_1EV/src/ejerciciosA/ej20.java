package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej20 {
    
    // Crea un programa que cree un array de tamaño 1000 y lo rellene con 
    // valores enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). 
    // Luego pedirá por teclado un valor N y se mostrará por pantalla si N 
    // existe en el array, además de cuantas veces.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int valores[] = new int[1000], N, veces=0;
               
        for (int i = 0; i < valores.length; i++) {
            // int aleatorio entre 0 y 100
            int aleat = (int) (0 + Math.random() * (100+1));
            valores[i] = aleat;
        }
        Arrays.sort(valores);
        
        System.out.println("Introduce un valor para comprobar si existe en el array: ");
        N = reader.nextInt();
        
        // System.out.println("\n Los valores son: " + Arrays.toString(valores));
        
        if(Arrays.binarySearch(valores,N) < 0){
            System.out.println("El número "+N+" no está en el array.");
        }else{
            for (int i = 0; i < valores.length; i++) {
            if(valores[i] == N){
                veces++;
            }
            }
            System.out.println("El número "+N+" aparece "+veces+" veces el array.");
        }
    }
}

