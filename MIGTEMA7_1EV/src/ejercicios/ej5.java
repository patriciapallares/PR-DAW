package ejercicios;

import java.util.Scanner;

public class ej5 {
    
    /*
    Escribe un programa que pida un valor entero en millas y muestre su 
    equivalente en kilómetros. Recuerda que una milla son 1,60934 kilómetros. 
    Implementa y utiliza la función:
    double millas_a_kilometros(int millas). Devuelve la conversión de millas a kilómetros
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        double N, resultado;
        
        System.out.println("Introduce las millas: ");
        N = reader.nextInt();

        resultado = millas_a_kilometros(N);
        
        System.out.println("Son " +resultado + "km.");
        
    }
    
    public static double millas_a_kilometros(double millas){
        double km = millas * 1.60934;
        return km;
    }
}
