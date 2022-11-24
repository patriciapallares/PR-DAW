package tema5_1ev;

import java.util.Scanner;

public class EJ14 {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);        
        int cantidad = 0, n=500, billetes=0;
        
        System.out.println("Escribe una cantidad de dinero en €: ");
        cantidad = reader.nextInt();
                            
        while(cantidad>0){
            billetes = cantidad/n;
            cantidad = cantidad % n;
            System.out.println(billetes + " billetes de "+n+"€");
        
            switch (n) {
                case 500 -> { 
                    n=200;
                    break;
                }
                case 200 -> { 
                    n=100;
                    break;
                }
                case 100 -> { 
                    n=50;
                    break;
                }
                case 50 -> { 
                    n=20;
                    break;
                }
                case 20 -> { 
                    n=10;
                    break;
                }
                case 10 -> { 
                    n=5;
                    break;
                }                
            }
        }
    }
}
