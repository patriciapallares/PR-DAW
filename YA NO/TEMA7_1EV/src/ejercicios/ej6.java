package ejercicios;

import java.util.Scanner;

public class ej6 {
    
    /*
    Escribe un programa que pida cinco precios y muestre por pantalla el precio 
    de venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
    double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        double N, resultado;
        
        for(int i = 0; i < 5; i++){
            System.out.println((i+1)+". Introduce un precio: ");
            N = reader.nextInt();
            resultado = precioConIVA(N);
            System.out.println("El precio más IVA es: " + resultado);
        }
        
    }
    
    public static double precioConIVA(double precio){
        double precioFinal = precio * 1.21;
        return precioFinal;
    }
}
