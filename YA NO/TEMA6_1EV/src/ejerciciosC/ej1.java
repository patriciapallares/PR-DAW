package ejerciciosC;

/**
 *
 * @author patriciapallares
 */

public class ej1 {
    
    // Crea un programa que cree una matriz de tamaño 5x5 que almacene los 
    // números del 1 al 25 y luego muestre la matriz por pantalla.

    public static void main(String[] args) {
        
        int numeros[][] = new int[5][5], acum=1;
            
            for (int x=0; x < numeros.length; x++) {
                
                for (int y=0; y < numeros[x].length; y++) { 
                    // numeros[x].length es la longitud de la columna
                    numeros[x][y] = acum;
                    acum++;
                    System.out.print(numeros[x][y]+" ");
                    //System.out.println ("[" + x + "," + y + "] = " + numeros[x][y]);
                }
                System.out.println("");
                
            }
    }
}
