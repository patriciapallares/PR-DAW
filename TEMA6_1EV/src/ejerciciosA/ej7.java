package ejerciciosA;

/**
 *
 * @author patriciapallares
 */
import java.util.Arrays;
import java.util.Scanner;

public class ej7 {

    // Crea un programa que pida dos valores enteros P y Q, 
    // luego cree un array que contenga todos los valores 
    // desde P hasta Q, y lo muestre por pantalla.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int P,Q;
        System.out.println("Introduce un número entero: ");
        P = reader.nextInt();
        
        System.out.println("Introduce otro número entero mayor: ");
        Q = reader.nextInt();
        
        int valores[] = new int[(Q-P+1)];
        

        for (int i = 0; i < valores.length; i++) {
            valores[i] = i+P;
        }

        System.out.println("El array generado es: " + Arrays.toString(valores));
    }
}
