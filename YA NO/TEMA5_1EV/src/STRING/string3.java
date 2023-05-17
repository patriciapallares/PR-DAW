package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class string3 {
    
     public static void main(String[] args) throws IOException{
     
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         
         // Scanner reader = new Scanner(System.in);  
         String cad, carString;
         char car;
         int accCar=0;

         System.out.println("Escribe una palabra o serie de palabras");
         cad = reader.readLine();
         System.out.println("Y escribe un caracter y se mostrará cuántas veces se repite: ");
         carString = reader.readLine();
         
         car = carString.charAt(0);
                  
         for(int i=0; i<cad.length(); i++){

             if(cad.charAt(i)==car){
                 accCar++;
             }
         }
         
         System.out.println("El caracter "+ "'"+car+"' se repite "+accCar+" veces.");
     }
}
