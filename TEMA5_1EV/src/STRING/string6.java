package STRING;

import java.util.Scanner;

public class string6 {
    
     public static void main(String[] args){
     
         Scanner reader = new Scanner(System.in);  
         String cad = "";
         
         int accVocalA=0, accVocalE=0, accVocalI=0, accVocalO=0, accVocalU=0;

         System.out.println("Escribe en minúsculas una palabra o serie de palabras y se mostrará el número de vocales que tiene");
         cad = reader.nextLine();
         
         for(int i=0; i<cad.length(); i++){
             char letra = cad.charAt(i);
             switch (letra) {
                case 'a' -> { 
                    accVocalA++;
                    break;
                }
                case 'e' -> { 
                    accVocalE++;
                    break;
                }
                case 'i' -> { 
                    accVocalI++;
                    break;
                }   
                case 'o' -> { 
                    accVocalO++;
                    break;
                }
                case 'u' -> { 
                    accVocalU++;
                    break;
                }                
            }
             
         }
         
         if(accVocalA > 0){
            String asteriscos = "";         
            for(int i=0; i<accVocalA; i++){
                asteriscos+= "*";
            }
             System.out.println("a " + accVocalA + " " + asteriscos);
         }
         if(accVocalE > 0){
            String asteriscos = "";         
            for(int i=0; i<accVocalE; i++){
                asteriscos+= "*";
            }
             System.out.println("e " + accVocalE + " " + asteriscos);
         }
         if(accVocalI > 0){
            String asteriscos = "";         
            for(int i=0; i<accVocalI; i++){
                asteriscos+= "*";
            }
             System.out.println("i " + accVocalI + " " + asteriscos);
         }      
         if(accVocalO > 0){
            String asteriscos = "";
            for(int i=0; i<accVocalO; i++){
                asteriscos+= "*";
            }
             System.out.println("o " + accVocalO + " " + asteriscos);
         }
         if(accVocalU > 0){
            String asteriscos = "";
            for(int i=0; i<accVocalU; i++){
                asteriscos+= "*";
            }
             System.out.println("u " + accVocalU + " " + asteriscos);
         }            
     }
}

            
