package tema4_1ev;


/**
 *
 * @author patricia pallarés gonzález
 */
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        float A,B,C, mayor;
            
        System.out.println("Escribe un número: ");
        A = reader.nextFloat();
            
        System.out.println("Escribe otro número: ");
        B = reader.nextFloat();
        
        System.out.println("Escribe otro número: ");
        C = reader.nextFloat();

        if (A>B && A>C){
            mayor = A;
            System.out.println(mayor + " es el mayor.");
        } else if (B>C && B>A) {
            mayor = B;
            System.out.println(mayor + " es el mayor.");
        } else if (C>A && C>B) {
            mayor = C;
            System.out.println(mayor + " es el mayor.");
        }
    }
}
