package tema4_1ev;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args){
        double N, metros;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Escribe la cantidad de millas marinas que quieres convertir a metros: ");
        N = reader.nextDouble();
        metros = N * 1852;
        System.out.println(N + " millas marinas son " + metros + " metros.");
        
    }
}
