package ejercicios;

import java.util.Scanner;

public class ej9 {
    
    /*
    Realiza un programa que pida introducir tres valores enteros y nos diga cuál
    de ellos es el más elevado. Impleméntalo creando únicamente una función a la 
    que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int A,B,C, mayor1, mayorTotal;
        
        System.out.println("Introduce el número A: ");
        A = reader.nextInt();
        
        System.out.println("Introduce el número B: ");
        B = reader.nextInt();
        
        System.out.println("Introduce el número C: ");
        C = reader.nextInt();
        
        mayor1 = maximo(A,B);
        mayorTotal = maximo(mayor1, C);
        
        System.out.println("El mayor es: " + mayorTotal);
        
    }
    
    public static int maximo(int a, int b){
        if(a < b){
            return b;
        }else{
            return a;
        }
    }  
    
}
