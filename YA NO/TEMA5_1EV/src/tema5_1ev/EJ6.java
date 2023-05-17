package tema5_1ev;

import java.util.Scanner;

public class EJ6 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        float num;
        int accNeg=0;

        for(int i=1;i<=10;i++){
            
            System.out.println("Escribe un número: ");
            num = reader.nextInt();
            
            if(num<0){
                accNeg++;
            }
        }
        
        if(accNeg>0){
            System.out.println("Alguno de los números introducidos era negativo.");
        }
    }    
}
    

