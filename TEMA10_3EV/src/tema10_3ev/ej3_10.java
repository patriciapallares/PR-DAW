package tema10_3ev;

import java.util.*;

/**
 *
 * @author patgon
 */
public class ej3_10 {

    public static void main(String[] args) {
        double valores[] = new double[5];
        int valor;
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            try{
            System.out.println("Introduce un valor: ");
            valor = reader.nextInt();

            valores[i] = valor;
            }
            catch(InputMismatchException ex)
            {
                System.out.println("Valor introducido incorrecto. Vuelve a introducir el valor.");
                reader.nextLine();
                i--;
            }
        }
    }

}
