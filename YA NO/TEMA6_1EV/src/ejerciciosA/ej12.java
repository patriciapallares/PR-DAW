package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej12 {

    // Crea un programa que cree un array de 10 enteros y luego muestre el 
    // siguiente menú con distintas opciones:
    // a. Mostrar valores. b. Introducir valor. c. Salir.
    // La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ 
    // pedirá un valor V y una posición P, luego escribirá V en la posición 
    // P del array. El menú se repetirá indefinidamente hasta que el usuario 
    // elija la opción ‘c’ que terminará el programa.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int valores[]={1,2,3,4,5,6,7,8,9,10};
        int V, P;
        String text;
       
        
        do{
        System.out.println("\n Menú:");
        System.out.println("\n a. Mostrar valores. \n b. Introducir valor. \n c. Salir.");
        text = reader.nextLine();
            
        if("a".equals(text)){
            System.out.println("\n Los valores son: " + Arrays.toString(valores));
            
        }else if("b".equals(text)){
            System.out.println("\n Introduce un valor entero: ");
            V = reader.nextInt();
            
            System.out.println("Introduce una posición de 0 a 9: ");
            P = reader.nextInt();
            
            for(int i=0;i<valores.length;i++){
                if(i == P){
                    valores[i]=V;
                }
            }
        }
        
        
        }while(!"c".equals(text));
        

    }
}
