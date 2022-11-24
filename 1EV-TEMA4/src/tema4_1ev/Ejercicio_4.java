package tema4_1ev;

/**
 *
 * @author patricia pallarés gonzález
 */
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args){
    
        float N, M, suma, resta, mult, div;
        Scanner reader = new Scanner(System.in);

        System.out.print("Introduce un número distinto a 0: ");
        N = reader.nextFloat();
        System.out.print("Introduce otro número distinto a 0: ");
        M = reader.nextFloat();

        suma = N + M;
        resta = N - M;
        mult = N * M;
        div = N / M;

        System.out.print("La suma es: " + suma + ".\nLa resta es: " + resta + ".\nLa multiplicación es: " + mult + ".\nLa división es: " + div);
    }
    
}
