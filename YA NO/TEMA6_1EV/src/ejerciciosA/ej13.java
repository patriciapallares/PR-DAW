package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej13 {

    // Crea un programa que permita al usuario almacenar una secuencia 
    // aritmética en un array y luego mostrarla. Una secuencia aritmética es 
    // una serie de números que comienza por un valor inicial V, y continúa 
    // con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 
    // 1, 3, 5, 7, 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... 
    // El programa solicitará al usuario V, I además de N (nº de valores a crear).
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int V=0, I=0, N=0, acum=0;
       
        System.out.println("Introduce el nº de valores a crear: ");
        N = reader.nextInt();
        
        int valores[] = new int[N];
        
        System.out.println("Introduce el valor inicial: ");
        V = reader.nextInt();
        System.out.println("Introduce el valor incremental: ");
        I = reader.nextInt();
       
        for (int i = 0; i < valores.length; i++) {           
            valores[i]=V+acum;
            acum += I;
        }
        
        System.out.println("El array generado es: " + Arrays.toString(valores));
    }
}