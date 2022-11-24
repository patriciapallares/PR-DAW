package tema4_1ev;
import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args){
    int edad;
    Scanner reader = new Scanner(System.in);
    
    System.out.println("Introduce tu edad: ");
    edad = reader.nextInt();
    
        if(edad>=18){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Eres menor de edad.");
        }
    }
}
