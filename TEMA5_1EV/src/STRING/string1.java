package STRING;

import java.util.Scanner;

public class string1 {
    
     public static void main(String[] args){
     
         Scanner reader = new Scanner(System.in);  
         String cad = "";
         int accVocales=0;
         
         System.out.println("Escribe en minúsculas una palabra o serie de palabras y se mostrará el número de vocales que tiene");
         cad = reader.nextLine();
         
         for(int i=0; i<cad.length(); i++){
             char letra = cad.charAt(i);
             if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                 accVocales++;
             }
         }
         System.out.println("La cantidad de vocales es " + accVocales);
     }
}
