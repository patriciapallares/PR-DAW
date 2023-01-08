package ejerciciosB;

import java.util.Arrays;
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
        char[] aCaracteres1, aCaracteres2;
        String cadena1 = "", cadena2 = "",minusCadena1,minusCadena2;
        
        System.out.println("Introduce una frase: ");
        cadena1 = reader.nextLine();
        
        System.out.println("Introduce otra frase: ");
        cadena2 = reader.nextLine();
        
        minusCadena1 = cadena1.toLowerCase();
        minusCadena2 = cadena2.toLowerCase();
        
        aCaracteres1 = minusCadena1.toCharArray();
        aCaracteres2 = minusCadena2.toCharArray();
        
        // equalsIgnoreCase(String s)
        
        if(Arrays.equals(aCaracteres1, aCaracteres2)){
            System.out.println("Las frases son iguales.");
        }else{
            System.out.println("Las frases son distintas.");
        }
    }
}
