package ejercicios;

import java.util.Scanner;

public class ej11 {
    
    // PENDIENTE
    
    /*
    Realiza un programa que escriba la tabla de multiplicar de un número 
    introducido por teclado. Para ello implementa una función que reciba como 
    parámetro un número entero y muestre por pantalla la tabla de multiplicar 
    de dicho número.
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int dia,mes,año;
        boolean resultado;
        
        System.out.println("Introduce nº del dia: ");
        dia = reader.nextInt();
        
        System.out.println("Introduce nº de mes: ");
        mes = reader.nextInt();
        
        System.out.println("Introduce nº de año: ");
        año = reader.nextInt();
                
        if(fechaCorrecta(dia,mes,año)){
            System.out.println("La fecha es correcta.");
        }else{
            System.out.println("La fecha es incorrecta.");
        }
        
    }
    
    public static boolean fechaCorrecta(int a, int b, int c){
        if((a>0&&a<=30)&&(b>0&&b<=12)&&(c>0)){
            return true;
        }else{
            return false;
        }
    }  
    
}
