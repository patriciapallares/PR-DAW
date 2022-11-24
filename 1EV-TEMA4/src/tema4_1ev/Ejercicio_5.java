package tema4_1ev;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args){
        // circunferencia = 2πr
        // area = πr²
        // volumen = 4/3 πr³
        
        double r,c,a,v;
        Scanner reader = new Scanner(System.in);
                
        System.out.println("Escribe el valor de la longitud del radio: ");
        r = reader.nextDouble();
        
        c = 2 * Math.PI * r;
        a = Math.PI * Math.pow(r, 2);
        v = 4/3 * Math.PI * Math.pow(r, 3);
        
        System.out.println("La longitud de la circunferencia es: " + c + "\nEl área del círculo es: " + a + "\nEl volumen de la esfera es: " + v);    
    }
}
