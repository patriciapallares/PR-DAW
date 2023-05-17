package ejercicios;

import java.util.Scanner;

public class ej12 {
    
    /*
    Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. 
    El programa debe tener una función que reciba como parámetro una cantidad 
    en kilómetros y nos la devuelva en millas.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        double N, resultado;
        
        System.out.println("Introduce los kilometros: ");
        N = reader.nextDouble();

        resultado = kilometros_a_millas(N);
        
        System.out.println("Son " +resultado + "millas.");
        
    }
    
    public static double kilometros_a_millas(double km){
        double millas = km / 1.60934;
        return millas;
    }
}

