package tema5_1ev;

import java.util.Scanner;

public class EJ10 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        float nota;
        int notas10 = 0;
        
        do{        
            System.out.println("Escribe una nota: ");
            nota = reader.nextFloat();
            
            if(nota==10){
                notas10++;
            }                      
        
        }while(nota!=-1);
      
        if(notas10>0){
            System.out.println("Hubo alguna nota con valor 10");
        }
    }    
}
    