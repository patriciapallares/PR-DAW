package EjercicioBanco;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBanco {
    
        // PENDIENTE doWhile para comprobar menú del 1 al 6
    
        // Escribir un programa que permita guardar las cuentas de un banco con 
        // sus respectivos saldos. Para ello, se guardará la información en un 
        // array paralelo (dos arrays unidimensionales, uno con los números de 
        // cuenta y otro los saldos).
        // El programa deberá mantener las cuentas ordenadas, de menor a mayor, 
        // por número de cuenta para facilitar la búsqueda de una cuenta. 
        // El programa mostrará un menú con las siguientes opciones: 
        /*
        1.- Dar de alta una nueva cuenta (comprobando que el array no esté lleno
        y colocando la cuenta en la posición correspondiente dentro del array.
        2.- Eliminar una cuenta (comprobando que el array no esté vacío y 
        reposicionando las cuentas en el array.
        3.- Mostrar una cuenta (mostrará el número de cuenta y el saldo 
        correspondiente).
        4.- Mostrar información (Número de cuentas dadas de alta y dinero 
        total de todas ellas). 
        5.- Calcular el saldo medio, máximo y mínimo de las cuentas del array. 
        6.- Mostrar todas las cuentas (1 línea por cuenta con su número y su 
        saldo). 
        0.- Terminar 

        Para todo esto debéis utilizar los métodos que consideréis oportunos, 
        recordar escribir un comentario explicando el objetivo del método.
        */
    
        public static void main(String[] args){
            
        
        Scanner reader = new Scanner(System.in);  
        
            float saldos[] = new float[10];
            float saldo;
            float cuentas[] = new float[10];
            int numCuentas = 0;
            int menu;
        
            System.out.println("Aplicación del banco.");
            
            do{
            System.out.println("\n Menú:");
            System.out.println("\n 1.- Dar de alta una nueva cuenta" +
                "\n 2.- Eliminar una cuenta" +
                "\n 3.- Mostrar una cuenta" +
                "\n 4.- Mostrar información" +
                "\n 5.- Calcular el saldo medio, máximo y mínimo de las cuentas del array." +
                "\n 6.- Mostrar todas las cuentas" +
                "\n 0.- Terminar ");

            menu = reader.nextInt();
            
            if(menu == 1){
                // Dar de alta una nueva cuenta

                cuentas[numCuentas] = numCuentas;
                System.out.println("Introduce el saldo de la cuenta nueva: ");
                saldo = reader.nextFloat();

                saldos[numCuentas] = saldo;

                System.out.println("Cuenta " + (cuentas[numCuentas]+1) + " tiene " + saldos[numCuentas]);
                
                numCuentas++;
            
            }else if(menu == 2){
                // Eliminar una cuenta (comprobando que el array no esté vacío y
                // reposicionando las cuentas en el array.
                
                System.out.println("¿Cuál es el número de la cuenta que quieres eliminar?");
                int numeroCuenta = reader.nextInt();
                int posicion = -1;

                
            }else if(menu == 3){
                // Mostrar una cuenta (mostrará el número de cuenta y el saldo 
                // correspondiente).
            }else if(menu == 4){
                // Mostrar información (Número de cuentas dadas de alta y dinero 
                // total de todas ellas). 
            }else if(menu == 5){
                // Calcular el saldo medio, máximo y mínimo de las cuentas del array.
            }else if(menu == 6){
                // Mostrar todas las cuentas (1 línea por cuenta con su número y 
                // su saldo). 
            }
            
            }while(menu != 0);
            
    }


}
