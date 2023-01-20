package ejercicios;

import java.util.Scanner;

public class ej11 {

    /*
    Realiza un programa que escriba la tabla de multiplicar de un número 
    introducido por teclado. Para ello implementa una función que reciba como 
    parámetro un número entero y muestre por pantalla la tabla de multiplicar 
    de dicho número.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int N;
        
        System.out.println("Introduce un número: ");
        N = reader.nextInt();

        multiplicar(N);
    }
    
    public static void multiplicar(int a){
        
        int array[] = new int[10];
        
        for (int i = 1; i <= 10; i++) {
            array[i-1]=a*i;
            System.out.println(a+"x"+i+"="+(a*i));
        }
        
        
    }  
    
}
