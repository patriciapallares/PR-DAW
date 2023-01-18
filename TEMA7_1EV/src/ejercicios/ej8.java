package ejercicios;

import java.util.Scanner;

public class ej8 {
    
    /*
    Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
    desde 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. 
    Implementa y utiliza las funciones:
    int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
    int producto1aN(int n) // Devuelve el producto de enteros de 1 a n 
    double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int N, resulSuma;
        
        System.out.println("Introduce un número: ");
        N = reader.nextInt();
        
        System.out.println("La suma es " + suma1aN(N));
        System.out.println("El producto es " + producto1aN(N));
        System.out.println("El intermedio es " + intermedio1aN(N));
    }
    
    public static int suma1aN(int n){
        int suma = 0;
        for(int i = 0; i <= n; i++){
            suma += i;
        }
        return suma;
    }
    
    public static int producto1aN(int n){
        int prod = 1;
        for(int i = 1; i <= n; i++){
            prod=prod*i;   
        }
        return prod;
    }
    
    public static double intermedio1aN(int n){
        double intermedio = (n+1)/2;
        return intermedio;
    }
    
    
    
}
