package tema5_1ev;

import java.util.Scanner;

public class EJ7 {
    
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
        
        System.out.println("Han sido introducidos "+accNeg+" números negativos y " +(10-accNeg)+ " números positivos.");
        
    }    
}
    

