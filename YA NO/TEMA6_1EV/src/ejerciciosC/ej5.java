package ejerciciosC;

/**
 *
 * @author patriciapallares
 */

import java.util.Scanner;

public class ej5 {
    
    // CORREGIR FOR LÍNEA 50
    
    // Necesitamos crear un programa para registrar sueldos de hombres y 
    // mujeres de una empresa y detectar si existe brecha salarial entre ambos. 
    // El programa pedirá por teclado la información de N personas distintas 
    // (valor también introducido por teclado). Para cada persona, pedirá su 
    // género (0 para varón y 1 para mujer) y su sueldo. Esta información debe 
    // guardarse en una única matriz. Luego se mostrará por pantalla el sueldo 
    // medio de cada género.

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);  
        int N, suma0=0,suma1=0;
        float sumaSueldo0=0, sumaSueldo1=0;
        
        System.out.println("Introduce el número de empleadxs: ");
        N = reader.nextInt();
        
        
        int sueldos[][] = new int[N][2];
            // guardar la info
            for (int x=0; x < sueldos.length; x++) {
                
                for (int y=0; y < sueldos[x].length; y++) {
                    // columna 0 -> sexo 
                    // columna 1 -> sueldo
                    if(y==0){
                        System.out.println("Introduzca el sexo (0 para varón y 1 para mujer): ");
                        sueldos[x][y] = reader.nextInt();
                    }else if(y==1){
                        System.out.println("Introduzca el sueldo: ");
                        sueldos[x][y] = reader.nextInt();                        
                    }
                }       
            }
            
            // gestionar la info
            for (int x=0; x < sueldos.length; x++) {  
                for (int y=0; y < sueldos[x].length; y++) {
                    if(y==0){
                        if(sueldos[x][y] == 0){
                            sumaSueldo0 += sueldos[x][y+1];
                            suma0++;
                        }else if(sueldos[x][y] == 1){
                            sumaSueldo1 += sueldos[x][y+1];
                            suma1++;
                        }
                    }
                }       
            }            
            
            System.out.println("Número de empleadas: "+suma1);
            System.out.println("Número de empleados: "+suma0);
            
            System.out.println("Sueldo medio de las empleadas: "+(sumaSueldo1/suma1));
            System.out.println("Sueldo medio de los empleados: "+(sumaSueldo0/suma0));            
    }
}
