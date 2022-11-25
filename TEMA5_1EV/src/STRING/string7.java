package STRING;

import java.util.Scanner;

public class string7 {
    
    // fuente https://algoritmosjavafc.blogspot.com/p/cadenas-en-java.html
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  

        String mensaje, cod1="",cod2="", caracter;
        
        String ABC="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String numeros="0123456789";

        System.out.println("Ingrese el mensaje: ");
        mensaje=reader.nextLine();
        
        System.out.println("Mensaje ingresado: "+mensaje);
        
        // a) Todo mensaje debe tener sus letras en mayúsculas
        mensaje=mensaje.toUpperCase();
        for (int i = 0; i < mensaje.length(); i++) {
            // se asigna a la variable caracter el resultado del método para extraer una porción de la cadena
            caracter=mensaje.substring(i, i+1);
            // se comprueba si caracter es un espacio
            if(caracter.equals(" ")){
                cod1=cod1+caracter;
            }
            else{
                for (int j = 0; j < ABC.length(); j++) {
                    // comprobación si caracter es igual a alguno de los caracteres (método substring) de la cadena ABC en orden desde j = 0
                if(caracter.equals(ABC.substring(j,j+1))){
                    // comprobación si caracter es igual a z
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
            // for anidado
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