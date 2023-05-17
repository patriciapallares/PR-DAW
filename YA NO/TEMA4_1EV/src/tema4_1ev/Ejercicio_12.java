package tema4_1ev;

/**
 *
 * @author patricia pallarés gonzález
 */
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        float N;
            
        System.out.println("Escribe un número: ");
        N = reader.nextFloat();
            
        if(N>=0){
            System.out.println(N + " es positivo.");
        } else {
            System.out.println(N + " es negativo.");               
        }
    }
}
