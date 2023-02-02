package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ej16 {
    
    /*
    Escribe un programa que cree un array del tamaño indicado por teclado y 
    luego lo rellene con valores aleatorios (utiliza Math.random()). 
    Implementa la función que rellena un array con valores aleatorios.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int N;
        
        System.out.println("Introduce la longitud del array: ");
        N = reader.nextInt();
        
        int valores[]= new int[N];
        
        valores = rellenaArray(N);
        
        System.out.println("El array generado es: " + Arrays.toString(valores));  
    }
    
    public static int[] rellenaArray(int longitud){
        int array[]= new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            array[i] = devuelveRandom();
        }

        return array;
    }
    
    public static int devuelveRandom(){
        int aleat = (int) (0 + Math.random() * (10+1));
        return aleat;
    }
}

