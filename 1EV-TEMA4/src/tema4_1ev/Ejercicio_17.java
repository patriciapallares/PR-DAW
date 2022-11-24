package tema4_1ev;

import java.util.Scanner;

public class Ejercicio_17 {
        public static void main(String[] args){
            
            Scanner reader = new Scanner(System.in);
            
            int horas,minutos,segundos;

            System.out.println("Escribe las horas: ");
            horas = reader.nextInt();

            System.out.println("Escribe los minutos: ");
            minutos = reader.nextInt();

            System.out.println("Escribe los segundos: ");
            segundos = reader.nextInt();
            

            System.out.println(horas+":"+minutos+":"+segundos);
            
    }
}
