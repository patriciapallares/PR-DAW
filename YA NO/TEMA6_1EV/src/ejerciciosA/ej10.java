package ejerciciosA;

/**
 *
 * @author patriciapallares
 */

import java.util.Scanner;

public class ej10 {

    // Crea un programa para realizar cálculos relacionados con la altura 
    // (en metros) de personas. Pedirá un valor N y luego almacenará en un 
    // array N alturas introducidas por teclado. Luego mostrará la altura 
    // media, máxima y mínima así como cuántas personas miden por encima y 
    // por debajo de la media.
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int N, masMedia=0, menosMedia=0;
        
        float valor, suma=0, media, maxima=0, minima=0;
        
        System.out.println("Introduce el numero de alturas que vas a introducir: ");
        N = reader.nextInt();

        float valores[] = new float[N];
        
        for(int i=0;i<valores.length;i++){
            System.out.println("Introduce una alutra en metros: ");
            valor = reader.nextFloat();
            
            valores[i] = valor; 
            suma += valor;
        }
        
        // maxima y minima
        for (int i = 0; i < valores.length; i++) {
            if(maxima == 0 && minima == 0){
                maxima = valores[i];
                minima = valores[i];
            }else if(valores[i]>maxima){
                maxima = valores[i];
            }else if(valores[i]<minima){
                minima = valores[i];
            }
        }
        
        // media, masMedia y menosMedia
        media = suma / N;
        
        for (int i = 0; i < valores.length; i++) {
            if(valores[i] > media){
                masMedia++;
            }else if(valores[i] < media){
                menosMedia++;
            }
        } 
        
        System.out.println("La altura media es: " + media);
        System.out.println("La altura máxima es: " + maxima);
        System.out.println("La altura mínima es: " + minima);
        System.out.println(masMedia + " personas miden por encima de la media. ");
        System.out.println(menosMedia + " personas miden por debajo de la media. ");
    }
}
