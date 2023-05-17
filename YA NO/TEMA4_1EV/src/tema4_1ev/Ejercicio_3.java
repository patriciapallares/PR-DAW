package tema4_1ev;

/**
 *
 * @author patricia pallarés gonzález
 */
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
        float lado, area;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el valor del lado: ");
        
        lado = reader.nextFloat();
        area = lado * lado;
        
        System.out.print("El área es: " + area);
    }
}
