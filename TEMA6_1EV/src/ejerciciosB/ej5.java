package ejerciciosB;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ej5 {
    
    // Realiza un programa que lea una frase por teclado e indique si la frase 
    // es un palíndromo o no (ignorando espacios y sin diferenciar entre 
    // mayúsculas y minúsculas). Supondremos que el usuario solo introducirá 
    // letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un palíndromo 
    // es un texto que se lee igual de izquierda a derecha que de derecha a 
    // izquierda. Ej: "Amo la pacífica paloma"
    
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in); 
        String frase="",fraseLow,fraseTrim;
        char[] arrayFrase;
        
        System.out.println("Introduce una frase: ");
        frase = reader.nextLine();
        
        fraseLow = frase.toLowerCase();
        fraseTrim = fraseLow.replace(" ","");
        arrayFrase = fraseTrim.toCharArray();
        
        
        char[]revArrayFrase = new char [arrayFrase.length];
        
        for (int i = 0; i < arrayFrase.length; i++){
            revArrayFrase[(arrayFrase.length - 1 -i)] = arrayFrase[i];
        }
        
        if(Arrays.equals(revArrayFrase, arrayFrase)){
            System.out.println("Es palíndromo.");
        }else{
            System.out.println("No es palíndromo.");
        }

    }
}
