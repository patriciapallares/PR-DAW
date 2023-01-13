package ejerciciosB;

import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ej4 {
    
    // CORREGIR EL ORDEN DE LAS EJECUCIONES EN LAS LÍNEAS 31 Y 32 
    
    // Crea un programa que muestre por pantalla cuantas vocales de cada tipo 
    // hay (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. 
    // No se debe diferenciar entre mayúsculas y minúsculas. Por ejemplo dada 
    // la frase “Mi mama me mima” dirá que hay:
    // NºdeA's:3 NºdeE's:1 NºdeI's:2 NºdeO's:0 NºdeU's:0
    
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in); 
        String frase="",fraseLow;
        char[] arrayFrase;
        int[] countVocales = {0, 0, 0, 0, 0};
        char[] vocales = {'a','e','i','o','u'};
        
        System.out.println("Introduce una frase: ");
        frase = reader.nextLine();
        
        arrayFrase = frase.toCharArray();
        fraseLow = frase.toLowerCase();
        
        for (int i = 0; i < arrayFrase.length; i++) { 
           char letra = fraseLow.charAt(i);
            
           for( int j= 0; j < vocales.length; j++){
              if(letra == vocales[j]){
                  countVocales[j]++;
              } 
           }
        }

        System.out.println(" Nº de A's: "+countVocales[0]+"\n Nº de E's: "+countVocales[1]+"\n Nº de I's: "+countVocales[2]+"\n Nº de O's: "+countVocales[3]+"\n Nº de U's: "+countVocales[4]);
    }
}
