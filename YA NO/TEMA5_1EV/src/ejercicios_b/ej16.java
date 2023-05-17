package ejercicios_b;

import java.util.Scanner;

public class ej16 {
    
    /*16. Realiza un programa en java que pida un número entero positivo y 
    nos diga si es primo o no.*/
    
    // fuente https://parzibyte.me/blog/2019/09/20/java-numero-primo/
    
    public static void main(String[] args){
                 
        Scanner reader = new Scanner(System.in);  
        int num, accPrimos = 0;
        
        System.out.println("Introduce un número entero: ");
        num = reader.nextInt();
        
        if(num == 0 || num == 1 || num == 4){
            System.out.println("No es primo");
        }
        
        for(int i=2; i<(num/2); i++) {
            if(num%i == 0){
                accPrimos++;
            }
        }
        
        if(accPrimos == 0){
            System.out.println(num + " es primo.");
        }else{
            System.out.println(num + " no es primo.");
        }   
    }
}
