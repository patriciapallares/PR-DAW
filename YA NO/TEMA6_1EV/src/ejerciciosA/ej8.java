package ejerciciosA;

/**
 *
 * @author patriciapallares
 */
import java.util.Arrays;
import java.util.Scanner;

public class ej8 {

    // Crea un programa que cree un array con 100 números reales 
    // aleatorios entre 0.0 y 1.0, utilizando Math.random(), y 
    // luego le pida al usuario un valor real R. Por último, 
    // mostrará cuántos valores del array son igual o superiores a R.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        int R, mayoroiguales=0;
        int valores[] = new int[100];
        
        System.out.println("Introduce un número real: ");
        R = reader.nextInt();

        for (int i = 0; i < valores.length; i++) {
            // int aleatorio entre 0 y 10
            int aleat = (int) (0 + Math.random() * (10+1));
            valores[i] = aleat;
        }
        
        for (int i = 0; i < valores.length; i++) {
            if(valores[i]>=R){
                mayoroiguales++;
            }
        } 

        System.out.println("El array generado es: " + Arrays.toString(valores));

        System.out.println("Hay " + mayoroiguales + " valores iguales o superiores a " + R);
    }
}
