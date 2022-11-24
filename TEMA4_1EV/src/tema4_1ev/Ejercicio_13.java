package tema4_1ev;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        float N, M;
            
        System.out.println("Escribe un número: ");
        N = reader.nextFloat();
            
        System.out.println("Escribe otro número: ");
        M = reader.nextFloat();
            
        if(N<M){
            System.out.println(N + ", " + M);
        } else {
            System.out.println(M + ", " + N);               
        }
    }
}
