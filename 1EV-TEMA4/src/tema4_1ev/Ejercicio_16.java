package tema4_1ev;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        float nota;
        
        System.out.println("Escribe una nota entre 0 y 10: ");
        nota = reader.nextFloat();
        
        if (nota<3){
            System.out.println("Muy deficiente.");  
        } else if (nota<5){
            System.out.println("Insuficiente.");  
        } else if (nota<6){
            System.out.println("Bien.");  
        } else if (nota<9){
            System.out.println("Notable.");  
        } else if (nota<10){
            System.out.println("Sobresaliente.");  
        }
    }
}
