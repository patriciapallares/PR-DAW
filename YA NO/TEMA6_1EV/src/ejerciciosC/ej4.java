package ejerciciosC;

/**
 *
 * @author patriciapallares
 */

import java.util.Scanner;

public class ej4 {
    
    // Necesitamos crear un programa para almacenar las notas de 4 alumnos 
    // (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario 
    // introducirá las notas por teclado y luego el programa mostrará la nota 
    // mínima, máxima y media de cada alumno.

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);   
        // 4 alumnos, 5 asignaturas        
        float notas[][] = new float[4][5],minima,maxima,sumaNotas;
            
            for (int x=0; x < notas.length; x++) {
                
                for (int y=0; y < notas[x].length; y++) { 
                    System.out.println("Introduzca la "+ (y+1) + "a nota del Alumno " + (x+1)+":");
                    notas[x][y] = reader.nextInt();
                }
            }
            
            for (int x=0; x < notas.length; x++) {
                minima=0;
                maxima=0;
                sumaNotas=0;
                
                for (int y=0; y < notas[x].length; y++) { 
                    sumaNotas += notas[x][y];
                    
                    if(maxima == 0 && minima == 0){
                        maxima = notas[x][y];
                        minima = notas[x][y];
                    }else if(notas[x][y] >maxima){
                        maxima = notas[x][y];
                    }else if(notas[x][y] <minima){
                        minima = notas[x][y];
                    }
                    
                }
                System.out.println("La nota mínima del Alumno " + (x+1) + " es " + minima);
                System.out.println("La nota máxima del Alumno " + (x+1) + " es " + maxima);
                System.out.println("La nota media del Alumno " + (x+1) + " es " + (sumaNotas/5));                
            }      
    }
}
