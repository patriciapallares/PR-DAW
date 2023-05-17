package ejercicios_b;

import java.util.Scanner;

public class ej15 {
    
    /* 15. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta 
    un número que introducimos por teclado.*/
    
    public static void main(String[] args){
    
        Scanner reader = new Scanner(System.in);  
        int num, multiplos = 0;
        
        System.out.println("Introduce un número entero: ");
        num = reader.nextInt();
        
        for(int i=0; i<num; i++) {
            if(i%3==0){
                multiplos++;
            }
        }
        
        System.out.println("Cantidad de múltiplos de 3: " + multiplos);
        
    }
    
}
