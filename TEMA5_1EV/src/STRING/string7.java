package STRING;

import java.util.Scanner;
/*
public class string7 {
    
     public static void main(String[] args){
     
         Scanner reader = new Scanner(System.in);  
         String cad = "", cadNew = "";

         System.out.println("Escribe una palabra o serie de palabras y se mostrará codificada.");
         cad = reader.nextLine();
         
         cadNew = cad.toUpperCase();
         
         for(int i = 97; i <= 122; i++){
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
            }  
         
         System.out.println("caracter a = " + (char)97);
         // System.out.println("Codificado: "+cadNew);
     }
 
}
*/

public class string7 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  

        String mensaje, cod1="",cod2="", caracter;
        String ABC="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros="0123456789";

        System.out.println("Ingrese el mensaje: ");
        mensaje=reader.nextLine();
        
        System.out.println("Mensaje ingresado: "+mensaje);
        mensaje=mensaje.toUpperCase();
        for (int i = 0; i < mensaje.length(); i++) {
            caracter=mensaje.substring(i, i+1);
            if(caracter.equals(" ")){
                cod1=cod1+caracter;
            }
            else{
                for (int j = 0; j < ABC.length(); j++) {
                if(caracter.equals(ABC.substring(j,j+1))){
                    if(caracter.equals("Z")){
                        cod1=cod1+"A";
                        break;
                    }
                    else{
                        cod1=cod1+ABC.substring(j+1,j+2);
                        break;
                    }
                }
            }
            for (int k = 0; k <numeros.length(); k++) {
                if(caracter.equals(numeros.substring(k,k+1))){
                    if(caracter.equals("9")){
                        cod1=cod1+"0";
                        break;
                    }
                    else{
                        cod1=cod1+numeros.substring(k+1,k+2);
                        break;
                    }
                }
            }
            }
           
        }
       // System.out.println("MENSAJE INGRESADO: "+mensaje);
        System.out.println("Mensaje codificado: "+cod1);
    }

}