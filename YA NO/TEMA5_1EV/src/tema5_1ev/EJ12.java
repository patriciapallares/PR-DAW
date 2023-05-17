package tema5_1ev;

import java.util.Scanner;

public class EJ12 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        int A, B, resultado = 1;
        
        System.out.println("Introduce el valor de la base: ");
        A = reader.nextInt();
        
        System.out.println("Introduce el valor de la potencia: ");
        B = reader.nextInt();
        
        for(int i=1;i<=B;i++){
            resultado = resultado * A;
        }
        
        System.out.println("El resultado es: " + resultado);

    }
}
