package tema5_1ev;

import java.util.Scanner;

public class EJ5 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        int num,factorial=1;
        
        System.out.println("Escribe un número entero para calcular su factorial: ");
        num = reader.nextInt();
                
        for(int i=1;i<=num;i++){
            factorial = factorial * i;
            
        }
        
        System.out.println("El factorial es: "+factorial);
    }    
}

    