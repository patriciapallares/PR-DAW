package ejercicios_b;

import java.util.Scanner;

public class ej17 {
    
    /*17. Realiza un programa que lea y acepte únicamente aquellos que sean 
    mayores que el último dado. La introducción de números finaliza con la 
    introducción de un 0.*/
    
    public static void main(String[] args){
                 
        Scanner reader = new Scanner(System.in);  
        int num1, num2, accNum=0, accFallos=0;

        System.out.println("Introduce un número inicial: ");
        num1 = reader.nextInt();
        
        do{
            System.out.println("Introduce otro número: ");
            num2 = reader.nextInt();
            
            if(num1>num2 && num2 != 0){
                System.out.println("Fallo, ¡es menor!");
                accFallos++;
            }
            
            num1 = num2;
            
            accNum++;
            
        }while(num1 != 0 || num2 != 0);
        
        System.out.println("Total de números introducidos: "+ accNum);
        System.out.println("Números fallados: "+ accFallos);
    }
}
