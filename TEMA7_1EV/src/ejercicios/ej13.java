package ejercicios;

import java.util.Scanner;

public class ej13 {
    
    // PENDIENTE
    
    /*
    Realiza un programa que calcule el porcentaje de descuento que nos han hecho 
    al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad 
    con el descuento aplicado. Se debe crear una función a la que le pasemos 
    ambos valores y nos devuelva el descuento
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

