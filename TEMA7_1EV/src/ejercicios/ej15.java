package ejercicios;

import java.util.Scanner;

public class ej15 {
    
    // PENDIENTE
    
    /*
    Escribe un programa que cree un array de tamaño 100 con los primeros 100 
    números naturales. Luego muestra la suma total y la media. Implementa una 
    función que calcule la suma de un array y otra que calcule la media de un 
    array.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        double N, M, resultado;
        
        System.out.println("Introduce la cantidad sin descuento: ");
        N = reader.nextDouble();
        
        System.out.println("Introduce la cantidad con el descuento aplicado: ");
        M = reader.nextDouble();

        resultado = descuentoDe(N,M);
        
        System.out.println("Son " +resultado + "millas.");
        
    }
    
    public static double descuentoDe(double a, double b){
        double millas=0;
        return millas;
    }
}

