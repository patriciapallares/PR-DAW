package ejerciciosB;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ej1 {
    
    // PENDIENTE
    
    // Crea un programa que pida una cadena de texto por teclado y luego 
    // muestre cada palabra de la cadena en una línea distinta.
    
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);  
        char[] aCaracteres;
        int longitud;
        String cadena = "", posiciones="";
        String palabraS = "";
        
        System.out.println("Introduce una frase: ");
        cadena = reader.nextLine();
        
        
        aCaracteres = cadena.toCharArray();
        
        System.out.println("El array generado es: " + Arrays.toString(aCaracteres));
        
        // posiciones que ocupan " " y "."
        // búsqueda en un array
        int resp = 0, prevResp = 0;        
        for (int i = 0; i < aCaracteres.length; i++) {
            if(aCaracteres[i] == ' ' || aCaracteres[i] == '.'){
                resp = i;
                String respString = String.valueOf(resp);
                posiciones += respString + ", ";
                
                char[] palabra = new char[i];
                System.arraycopy(aCaracteres, prevResp, palabra, 0, (resp-prevResp));
                
                System.out.println(Arrays.toString(palabra));
                
                prevResp = resp;
                for (int j = 0; j < palabra.length; j++){

                    palabraS += palabra[j];
                }
                System.out.println(palabraS);
            }
        } 
        System.out.println("Posiciones "+ posiciones);
    }
}
