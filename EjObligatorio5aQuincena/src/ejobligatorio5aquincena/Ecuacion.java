package ejobligatorio5aquincena;

/**
 *
 * @author Patricia Pallarés González
 */

import java.util.Scanner;

public class Ecuacion {
    
    // Programa que resuelve una ecuación de segundo grado
    // Se le pregunta al usuario si desea resolver una ecuación y se lee S / N
    // WHILE: Si S:
        // Se piden 3 números y se guardan en las variables a, b y c
        // Calculamos el discriminante
            // If con las 3 opciones de resultado
                // Disc > 0 => mostrar "x1=valor y x2=valor"
                // Disc == 0 => mostrrar "Raíces iguales x1=x2=valor"
                // Disc < 0 => mostrar "Raíces complejas"

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String respPregunta = "";
        double a, b, c, disc, raizDisc, x1, x2;
        
        System.out.println("¿Desea resolver una ecuación de 2º grado? S / N");
        respPregunta = reader.nextLine();
        
        while("S".equals(respPregunta) || "s".equals(respPregunta)){
            System.out.println("Introduce el valor de a: ");
            a = reader.nextFloat();
            System.out.println("Introduce el valor de b: ");
            b = reader.nextFloat();          
            System.out.println("Introduce el valor de c: ");
            c = reader.nextFloat();
            
            disc = b*b-4*a*c;
            System.out.println("Discriminador = " + disc);
            
            if(disc > 0){
                raizDisc = Math.sqrt(disc);
                x1 = (-b + raizDisc) / (2*a);
                x2 = (-b - raizDisc) / (2*a);
                System.out.println("x1=" + x1 +" y x2=" + x2);
                
            }else if(disc == 0){
                x1 = -b / (2*a); 
                System.out.println ("Raíces iguales x1= x2= " + x1);
                
            }else{
                System.out.println("Raíces complejas.");
            }
            
        System.out.println("¿Desea resolver otra ecuación de 2º grado? S / N");
        respPregunta = reader.nextLine();
        respPregunta = reader.nextLine();
        }
    }
    
}
