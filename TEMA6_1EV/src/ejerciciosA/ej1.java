package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Scanner;

public class ej1 {
    
    // Crea un programa que pida diez números reales por teclado, 
    // los almacene en un array, y luego muestre todos sus valores.
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        
        int valores[]= new int[10], valor;
        
        
        for(int i=0;i<10;i++){
            System.out.println("Introduce un número real: ");
            valor = reader.nextInt();
            
            valores[i] = valor; 
        }
        
        System.out.println("Los números son: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]); 
        }
    }
}
