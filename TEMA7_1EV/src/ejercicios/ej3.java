package ejercicios;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class ej3 {

    // Escribe un programa que pida dos números enteros por teclado y muestre 
    // por pantalla cual es el mínimo. Implementa y utiliza la función: 
    // int minimo(int a, int b) // Devuelve el menor entre a y b
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int N,M, minimo;
        
        System.out.println("Introduce un número: ");
        N = reader.nextInt();
        
        System.out.println("Introduce un otro número: ");
        M = reader.nextInt();
        
        minimo = minimo(N,M);
        
        System.out.println("El menor es " + minimo);
        
    }
    
    public static int minimo(int a, int b){
        if(a > b){
            return b;
        }else{
            return a;
        }
    }
}
