package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string5 {
    
    // fuente: https://algoritmosjavafc.blogspot.com/2013/11/manejo-de-cadenas.html
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int longitud=0;
        // no sé porqué theLongest = null
        String cadena, palabra="", theLongest = null;

        System.out.println("Introduce una frase por teclado y se encontrará la palabra de mayor longitud: ");
        cadena = reader.readLine();
        
        cadena+=" ";
        
        // Bucle. Lee cada caracter de cada palabra y cuando caracter == " " realiza la comprobación de si su longitud-1
        // es mayor a 0 y así con cada palabra introducida sucedida por un espacio, asignando esa longitud-1 a la longitud
        
         for(int i=0;i<cadena.length();i++){
            
            // palabra => concatenación de caracteres 
            palabra = palabra+cadena.charAt(i);
            
            // if anidado 
            if(cadena.charAt(i)==' '){
                if(palabra.length()-1>longitud){

                    longitud=palabra.length()-1;
                    theLongest=palabra.trim();
                }
                palabra="";
            } 
        }
        System.out.println("La palabra de mayor longitud es: "+ theLongest);
        System.out.println("Su longitud es: "+ longitud);
    }
}