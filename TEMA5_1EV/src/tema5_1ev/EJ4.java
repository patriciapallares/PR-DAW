package tema5_1ev;

import java.util.Scanner;

public class EJ4 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        int num;
        
        System.out.println("Escribe un número entero: ");
        num = reader.nextInt();
                
        for(int i=1;i<=num;i++){
            System.out.println(i);         
        }
    }    
}
