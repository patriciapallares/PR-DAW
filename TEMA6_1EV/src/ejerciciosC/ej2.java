package ejerciciosC;

/**
 *
 * @author patriciapallares
 */

public class ej2 {
    
    // Crea un programa que cree una matriz de 10x10 e introduzca los valores 
    // de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). 
    // Luego mostrará la matriz por pantalla.

    public static void main(String[] args) {
        
        int numeros[][] = new int[10][10];
            
            for (int x=0; x < numeros.length; x++) {
                
                for (int y=0; y < numeros[x].length; y++) { 
                    numeros[x][y] = (x+1)*(y+1);
                    // System.out.println ("[" + x + "," + y + "] = " + numeros[x][y]);
                    System.out.printf("%4d", numeros[x][y]);
                }
                System.out.println("");
                
            }
    }
}
