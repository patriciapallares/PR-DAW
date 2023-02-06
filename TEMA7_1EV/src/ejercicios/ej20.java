package ejercicios;

import java.util.Scanner;

public class ej20 {
    
    /*
    Escribe un programa que imprima las tablas de multiplicar del 1 al 10. 
    Implementa una función que reciba un número entero como parámetro e 
    imprima su tabla de multiplicar.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int a;
        
        System.out.println("Escribe un número: ");
        a = reader.nextInt();
        
        calculaTabla(a);  
    }
    
    public static void calculaTabla(int a){   
        int tabla[] = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (i+1)*a;
            System.out.println((i+1)+" x "+ a +" = " + tabla[i]);
        }
    }
}

