package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Scanner;

public class ej3 {
    
    // Crea un programa que pida diez números reales por teclado, 
    // los almacene en un array, y luego lo recorra para averiguar
    // el máximo y mínimo y mostrarlos por pantalla.
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        
        int valores[]= new int[10], valor;
        int mayor=0, menor=0;
        
        for(int i=0;i<10;i++){
            System.out.println("Introduce un número real: ");
            valor = reader.nextInt();
            
            valores[i] = valor; 
        }

        for (int i = 0; i < valores.length; i++) {
            if(mayor == 0 && menor == 0){
                mayor = valores[i];
                menor = valores[i];
            }else if(valores[i]>mayor){
                mayor = valores[i];
            }else if(valores[i]<menor){
                menor = valores[i];
            }
        }
        
        System.out.println("El número mayor es "+ mayor +" y el menor es "+ menor);
    }
}
