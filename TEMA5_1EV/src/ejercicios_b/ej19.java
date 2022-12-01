
package ejercicios_b;

import java.util.Scanner;

public class ej19 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        int num;
        String asteriscos="";
        
        System.out.println("Introduce un número: ");
        num = reader.nextInt();
        
        if(num>0){
            
            for(int i=0; i<num; i++){
                asteriscos += "*";
            }
            
            System.out.println(asteriscos);
            
        }else{
            System.out.println("*");
        }
       
    }
}

