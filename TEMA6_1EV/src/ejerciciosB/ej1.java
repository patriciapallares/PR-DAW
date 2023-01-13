package ejerciciosB;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ej1 {
    
    // PENDIENTE
    
    // CAPTURA CORRECCIÓN
    
    // Crea un programa que pida una cadena de texto por teclado y luego 
    // muestre cada palabra de la cadena en una línea distinta.
    
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);  
        String frase;
        String[] frase_dividida;
        
        System.out.println("Introduce una frase: ");
        frase = reader.nextLine();
        
        frase_dividida = frase.split(" "); // 
        
        System.out.println("La frase dividida es: ");
        
        for(int i = 0; i < frase_dividida.length ; i++){
            System.out.println(frase_dividida[i]);
        }
    }
}
