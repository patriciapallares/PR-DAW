package ejerciciosB;

import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ej2 {
    
    // Crea un programa que pida dos cadenas de texto por teclado y luego 
    // indique si son iguales, además de si son iguales sin diferenciar 
    // entre mayúsculas y minúsculas.
    
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);  
        String cadena1 = "", cadena2 = "";
        
        System.out.println("Introduce una frase: ");
        cadena1 = reader.nextLine();
        
        System.out.println("Introduce otra frase: ");
        cadena2 = reader.nextLine();
        
        if(cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las frases son iguales.");
        }else{
            System.out.println("Las frases son distintas.");
        }
    }
}
