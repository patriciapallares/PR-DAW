package ejercicios;

import java.util.Scanner;

public class ej1 {

    // Escribe un programa que pida dos números reales por teclado y muestre por
    // pantalla el resultado de multiplicarlos. Implementa y utiliza la función:
    // double multiplica(double a, double b) // Devuelve la multiplicación de dos números
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        double N,M,resultado;
        
        System.out.println("Introduce un número: ");
        N = reader.nextDouble();
        
        System.out.println("Introduce un otro número: ");
        M = reader.nextDouble();
        
        resultado = multiplica(N,M);
        
        System.out.println("El resultado es: "+resultado);

    }
    
    public static double multiplica(double a, double b){
        double resp = a * b;
        
        return resp;
    }
}
