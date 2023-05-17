package ejerciciosA;

/**
 *
 * @author patriciapallares
 */
import java.util.Arrays;
import java.util.Scanner;

public class ej9 {

    // Crea un programa que cree un array de enteros de tamaño 100 
    // y lo rellene con valores enteros aleatorios entre 1 y 10 
    // (utiliza 1 + Math.random()*10). Luego pedirá un valor N y 
    // mostrará en qué posiciones del array aparece N.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        int N, mayoroiguales=0;
        int valores[] = new int[100];
        String posiciones=""; 
        
        System.out.println("Introduce un número real: ");
        N = reader.nextInt();

        for (int i = 0; i < valores.length; i++) {
            // int aleatorio entre 0 y 10
            int aleat = (int) (0 + Math.random() * (10+1));
            valores[i] = aleat;
        }
        
         System.out.println("El array generado es: " + Arrays.toString(valores));
         
        // búsqueda en un array
        int resp = -1;
        
        for (int i = 0; i < valores.length; i++) {
            if(valores[i] == N){
                resp = i;
                String respString = String.valueOf(resp);
                posiciones += respString + ", ";
            }
        } 
        
        System.out.println("Las posiciones son: "+ posiciones);
    }
}
