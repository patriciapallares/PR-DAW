package ejercicios;

import java.util.Scanner;

public class ej2 {

    // Escribe un programa que pida la edad por teclado y muestre por pantalla 
    // si eres mayor de edad o no. Implementa y utiliza la función: boolean 
    // esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int edad;
        
        System.out.println("Introduce tu edad: ");
        edad = reader.nextInt();
        
        boolean esMayor = esMayorEdad(edad);
        
        if(esMayor){
            System.out.println("Mayor de edad.");
        }else{
            System.out.println("Menor de edad.");
        }
    }
    
    public static boolean esMayorEdad(int a){
        return a>=18;
    }
}
