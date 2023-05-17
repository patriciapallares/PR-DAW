package ejercicios;

import java.util.Scanner;

public class ej17 {
    
    /*
    Realiza un programa que nos pida número enteros hasta que se introduzca el 
    0, diciéndonos, para cada número introducido si es primo o no. 
    Hay que recordar que un número es primo si es divisible por si mismo y por 
    1. El 1 no es primo por convenio. Se debe crear una función que pasándole 
    un número entero devuelva si es primo o no.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int num;
        
        do{
        System.out.println("Introduce un número entero: ");
        num = reader.nextInt();
        
        if(esPrimo(num)){
            System.out.println(num+ " es primo.");
        }else{
            System.out.println(num+ " no es primo.");
        }
        }while(num!=0);
        
    }
    
    public static boolean esPrimo(int a){
        boolean esPrimo = true;
        
        if(a == 0 || a == 1 || a == 4){
            esPrimo = false;
        }
        
        for(int i=2; i<(a/2); i++) {
            if(a%i == 0){
                esPrimo = false;
            }
        }

        return esPrimo;
    }

}

