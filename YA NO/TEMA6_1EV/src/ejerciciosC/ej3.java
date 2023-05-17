package ejerciciosC;

/**
 *
 * @author patriciapallares
 */

import java.util.Scanner;

public class ej3 {
    
    // Crea un programa que cree una matriz de tamaño NxM (tamaño introducido 
    // por teclado) e introduzca en ella NxM valores (también introducidos 
    // por teclado). Luego deberá recorrer la matriz y al final mostrar por 
    // pantalla cuántos valores son mayores que cero, cuántos son menores que 
    // cero y cuántos son igual a cero.

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);  
        int N,M, mayor0=0, menor0=0, igual0=0;
        
        System.out.println("Introduce el número de filas: ");
        N = reader.nextInt();

        System.out.println("Introduce el número de columnas: ");
        M = reader.nextInt();        
        
        int valores[][] = new int[N][M];
            
            for (int x=0; x < valores.length; x++) {
                
                for (int y=0; y < valores[x].length; y++) { 
                    System.out.println("Introduzca el valor [" + x + "," + y + "]");
                    valores[x][y] = reader.nextInt();
                    if(valores[x][y] == 0){
                        igual0++;
                    }else if(valores[x][y] >= 0){
                        mayor0++;
                    }else if(valores[x][y] <= 0){
                        menor0++;
                    }
                }
                
            }
            
        System.out.println("Igual a 0: "+igual0);
        System.out.println("Mayor que 0: "+mayor0);
        System.out.println("Menor que 0: "+menor0);
    }
}
