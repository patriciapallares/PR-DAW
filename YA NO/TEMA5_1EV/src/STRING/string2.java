package STRING;

import java.util.Scanner;

public class string2 {
    
     public static void main(String[] args){
     
         Scanner reader = new Scanner(System.in);  
         String cad = "", cadNew = "";

         System.out.println("Escribe una palabra o serie de palabras y se mostrará invertida.");
         cad = reader.nextLine();
         
         for(int i=(cad.length()-1); i>=0; i--){
             char letra = cad.charAt(i);
             cadNew = cadNew + letra;
         }
         
         System.out.println(cadNew);
     }
}
