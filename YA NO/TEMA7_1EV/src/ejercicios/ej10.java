package ejercicios;

import java.util.Scanner;

public class ej10 {
    
    /*
    Realiza un programa que lea una fecha introduciendo el día, mes y año por 
    separado y nos diga si la fecha es correcta o no. Supondremos que todos los 
    meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
    devuelva si es correcta o no.
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
