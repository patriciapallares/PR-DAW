package ejercicios;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class ej4 {

    // Escribe un programa que pida un número entero por teclado y muestre por 
    // pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
    // int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int N, resultado;
        
        System.out.println("Introduce un número: ");
        N = reader.nextInt();
        
        resultado = dimeSigno(N);
        
        switch (resultado) {
            case -1:
                System.out.println("Es negativo.");
                break;
            case 1:
                System.out.println("Es positivo.");
                break;
            default:
                System.out.println("Es igual a 0.");
                break;
        }
        
    }
    
    public static int dimeSigno(int a){
        if(a > 0){
            return 1;
        }else if (a < 0){
            return -1;
        }else{
            return 0;
        }
        
    }
}
