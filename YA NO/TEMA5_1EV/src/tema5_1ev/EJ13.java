package tema5_1ev;

import java.util.Scanner;

public class EJ13 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);        
        String seguir = "verdadero", respuesta = "";
        int max=100, min=1, anterior=0, num=0;
        
        System.out.println("Piensa un número.");
               
        while("verdadero".equals(seguir)){
            num = (max+min)/2;
            if (num == anterior){
                num = num + 1;
            }
            System.out.println("El número es " + num +"? Escribe + si es mayor, - si es menor o = si es el número.");
        
            respuesta = reader.nextLine();
        
            switch (respuesta) {
                case "+" -> { 
                    min = num;
                    anterior = num;
                    break;
                }
                case "-" -> { 
                    max = num;                    
                    anterior = num;
                    break;
                }
                case "=" -> seguir = "falso";     
            }
        }
        
        System.out.println("¡Acertado!");
    }
}
