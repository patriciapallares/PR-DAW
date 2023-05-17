
package ejercicios_b;

public class ej18 {
    
    public static void main(String[] args){
        
        /* 18. Realiza un programa para calcular la suma de los cuadrados de los 
        5 primeros números naturales. */

        double num, accCuadrados = 0;

        for(int i=1; i<=5; i++){
            
            double potencia = Math.pow(i,2);
            accCuadrados = accCuadrados + potencia;
            
        }  
    }
}
