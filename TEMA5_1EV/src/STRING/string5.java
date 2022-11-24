package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string5 {
    
    // fuente: https://algoritmosjavafc.blogspot.com/2013/11/manejo-de-cadenas.html
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int longitud=0;
        String cadena, palabra="", mostrar = null;

        System.out.println("Introduce una frase por teclado y se encontrará la palabra de mayor longitud: ");
        cadena = reader.readLine();
        
        cadena+=" ";

        for(int i=0;i<cadena.length();i++){
            palabra = palabra+cadena.charAt(i);
            if(cadena.charAt(i)==' '){
                if(palabra.length()-1>longitud){
                    longitud=palabra.length()-1;
                    mostrar=palabra.trim();
                }
                palabra="";
            } 
        }
        System.out.println("La palabra de mayor longitud es: "+ mostrar);
        System.out.println("Su longitud es: "+ longitud);
    }
}