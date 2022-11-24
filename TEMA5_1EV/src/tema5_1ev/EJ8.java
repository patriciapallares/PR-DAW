package tema5_1ev;

import java.util.Scanner;

public class EJ8 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        float num;
        int accNeg=0,accNum=0;
        
        do{        
            System.out.println("Escribe un número: ");
            num = reader.nextInt();
            
            if(num<0){
                accNeg++;
            }
            
            if(num!=0){
                accNum++;
            }            
        
        }while(num!=0);
      
        if(accNeg!=0){
            System.out.println("Han sido introducidos "+accNeg+" números negativos y " +(accNum-accNeg)+ " números positivos.");
        }else{
            System.out.println("Han sido introducidos "+accNum+" números.");
        }     
    }    
}
    