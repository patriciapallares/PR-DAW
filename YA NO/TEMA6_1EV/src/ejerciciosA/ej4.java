package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Scanner;

public class ej4 {
    
    // Crea un programa que pida veinte números reales por teclado, 
    // los almacene en un array, y luego muestre por separado la 
    // suma de todos los valores positivos y negativos.

    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        
        int valores[]= new int[20], valor;
        int sumaP=0, sumaN=0;
        
        for(int i=0;i<valores.length;i++){
            System.out.println("Introduce un número real: ");
            valor = reader.nextInt();
            
            valores[i] = valor; 
        }

        for (int i = 0; i < valores.length; i++) {
            
            if(valores[i]>=0){
                sumaP += valores[i];
            }else{
                sumaN += valores[i];
            }
            
        }
        
        System.out.println("La suma de positivos es "+ sumaP +" y la suma de negativos es "+ sumaN);
    }
}
