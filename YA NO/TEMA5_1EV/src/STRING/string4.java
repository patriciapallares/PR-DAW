package STRING;

import java.util.Scanner;

public class string4 {
    
     public static void main(String[] args){
     
         Scanner reader = new Scanner(System.in);  
         String cad = "";
         int accEspacios=0;
         
         System.out.println("Escribe una serie de palabras y se mostrará el número de palabras en la cadena.");
         cad = reader.nextLine();
         
         for(int i=0; i<cad.length(); i++){
             char letra = cad.charAt(i);
             if(letra == ' '){
                 accEspacios++;
             }
         }
         
         System.out.println("Hay " + (accEspacios+1) + " palabras.");
     }
}
