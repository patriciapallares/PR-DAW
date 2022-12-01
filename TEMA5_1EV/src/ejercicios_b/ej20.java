package ejercicios_b;

import java.util.Scanner;

public class ej20 {
    
    public static void main(String[] args){
        
        int num;
        String numCadena="";
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce un número entre 0 y 20: ");
        num = reader.nextInt();
        
        for(int i=1; i<=num; i++){
            
            for(int j=1; j<=i; j++){
                numCadena += Integer.toString(i);
            }
            System.out.println(numCadena);
            numCadena = "";
        }
    }
}
