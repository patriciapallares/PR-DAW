package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej17 {
    
    // Crea un programa que pida al usuario 20 valores enteros e introduzca 
    // los 10 primeros en un array y los 10 últimos en otro array. Por último, 
    // comparará ambos arrays y le dirá al usuario si son iguales o no.
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int N;
        int valores1[] = new int[10];
        int valores2[] = new int[10];
                
        for( int i = 0; i < (valores1.length); i++){

                System.out.println((i+1) + ". Introduce un número entero: ");
                N = reader.nextInt();
                
                valores1[i] = N;
        }
        
        for( int i = 0; i < (valores2.length); i++){

                System.out.println((i+11)+". Introduce un número entero: ");
                N = reader.nextInt();
                
                valores2[i] = N;
        }
        
        if(Arrays.equals(valores1, valores2)){
            System.out.println("Los arrays son iguales.");
        }else{
            System.out.println("Los arrays son distintos");
        }
    }
}

