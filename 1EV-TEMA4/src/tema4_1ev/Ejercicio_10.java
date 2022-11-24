package tema4_1ev;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args){
    
        float N, M, suma, resta, mult, div;
        Scanner reader = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        N = reader.nextFloat();
        System.out.print("Introduce otro número: ");
        M = reader.nextFloat();
        
        if(M != 0){
            suma = N + M;
            resta = N - M;
            mult = N * M;
            div = N / M;
            
            System.out.print("La suma es: " + suma + ".\nLa resta es: " + resta + ".\nLa multiplicación es: " + mult + ".\nLa división es: " + div);
        } else {
            System.out.print("Introduce un número distinto a 0: ");
            M = reader.nextFloat();
            if (M != 0){
                suma = N + M;
                resta = N - M;
                mult = N * M;
                div = N / M;

                System.out.print("La suma es: " + suma + ".\nLa resta es: " + resta + ".\nLa multiplicación es: " + mult + ".\nLa división es: " + div);
            } else {
                System.out.println("Fin");
            }
        }
    }
}
